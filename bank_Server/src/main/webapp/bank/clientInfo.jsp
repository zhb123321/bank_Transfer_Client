<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
  <title>客户信息</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="/css/layui.css"  media="all">
</head>
<body>  
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户信息</legend>
</fieldset>
 	
 	<div class="layui-form-item">
 	
	<label class="layui-form-label">&emsp;</label>
	<div class="layui-input-inline">
		<input type="text" placeholder="客户姓名" autocomplete="off" class="layui-input" id="realname">
	</div>
	<div class="layui-input-inline">
		<input type="text" placeholder="银行卡号" autocomplete="off" class="layui-input" id="cardnumber">
	</div>
	<div class="layui-input-inline">
		<input type="text" placeholder="账户编号" autocomplete="off" class="layui-input" id="userid">
	</div>
	<div class="layui-input-inline">
		<input type="text" placeholder="预留手机号" autocomplete="off" class="layui-input" id="phone">
	</div>
	</div>
	<div class="layui-form-item">
	<label class="layui-form-label">&emsp;</label>
		<div class="layui-input-inline">
			<label class="layui-form-label">开户时间:</label>
		</div>
		<div class="layui-input-inline">
				<input type="text" id="datestart" lay-verify="date" placeholder="yyyy-MM-dd" class="layui-input">
		</div>
		<div class="layui-input-inline" align="center">--</div>
		<div class="layui-input-inline">
				<input type="text" id="dateend" lay-verify="date" placeholder="yyyy-MM-dd" autocomplete="off" class="layui-input">
		</div>
	</div>

	<div class="layui-form-item">
		<label class="layui-form-label">&emsp;</label>
		<div class="layui-input-inline">
			<select  lay-filter="papers" id="papers" lay-verify="required" >
			       <option value="0">证件类型</option>
			       <option value="1">二代身份证</option>
			       <option value="2">其他</option>
   			</select>
 		</div>
 		<div class="layui-input-inline">
				<input type="text" id="idcard" placeholder="" class="layui-input">
		</div>
<form  class="layui-form" >
 		<div class="layui-input-inline">

			<select lay-verify="required" id="accountype">
		       <option value="">账户类型</option>
		       <option value="基本账户">基本账户</option>
		       <option value="专用账户">专用账户</option>
		       <option value="辅助账户">辅助账户</option>
   			</select>
   		</div>
   	</form>
	<button class="layui-btn" data-type="reload" >查询</button>
	</div>

	
<table class="layui-hide" id="test" lay-filter="test"></table>
 
<script type="text/html" id="Info">
  <div class="layui-btn-container">
    <button class="layui-btn layui-btn-sm" lay-event="deleteBySelect">删除选中的行数</button>
	<button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
  </div>
</script>

<script type="text/html" id="barDemo">
	<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
</script>
              
          
<script src="/js/layui.js" charset="utf-8"></script>
<script src="/js/jquery-1.8.3.js" charset="utf-8"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
 

	<script>
		layui.use(['table', 'form', 'layedit', 'laydate', 'jquery'], function() {
			var table = layui.table;
			var form = layui.form,
				layer = layui.layer,
				layedit = layui.layedit,
				laydate = layui.laydate;
			var $ = layui.jquery;
			form.render();
			/*日期*/
			laydate.render({
				elem: '#datestart'
			});
			laydate.render({
				elem: '#dateend'
			});
			/*证件类型*/
			form.on('select(papers)', function(data){
				$("#papersId").val($("#papers  option:selected").text());
			});  
			/*表格*/
			table.render({
				elem: '#test',
				url: '/clientInfo/pageInfo',
				toolbar: '#Info',
				title: '客户信息',
				limit: '5',
				limits: [5, 10, 20, 30],
				height: 400,
				id: 'query',
				where: {
					userid : '',
					realname : '',
					cardnumber : '',
					datestart : '',
					dateend :'',
					phone :'',
					accountype :'',
					idcard :''
				},
				request: {
					pageName: 'page' //页码的参数名称，默认：page
						,
					limitName: 'limit' //每页数据量的参数名，默认：limit
				},
				parseData: function(res) { //res 即为原始返回的数据
					return {
						"code": 0, //解析接口状态
						"msg": res.msg, //解析提示文本
						"count": res.count, //解析数据长度
						"data": res.data //解析数据列表
					};
				},
				cols: [
					[{type: 'checkbox',fixed: 'center'}, 
					{field: 'userid',title: '账户编号', minwidth: 80,unresize: true,sort: true}, 
					{field: 'realname',title: '账户姓名',minwidth: 120}, 
					{field: 'cardnumber',title: '银行卡',minwidth: 150}, 
					{field: 'idcard',title: '证件号码',minwidth: 150}, 
					{field: 'opendate',title: '开户时间',minwidth: 100}, 
					{field: 'iopendate',title: '开通网银日期',minwidth: 100}, 
					{field: 'openplace',title: '开户银行',minwidth: 100}, 
					{field: 'accountype',title: '账户类型',minwidth: 100}, 
					{field: 'accountsubject',title: '账户主体',minwidth: 100}, 
					{field: 'phone',title: '预留手机号',minwidth: 100},
					{field: 'house',title: '家庭住址',minwidth: 100}, 
				    {field: 'uptime',title: '最近操作时间',minwidth: 100}, 
				    {title: '操作',toolbar: '#barDemo',minwidth: 200}
				    ]
				],
				page: true
			});
			//搜索框的参数获取
	 		var $ = layui.$,
				active = {
					reload: function() {
						var userid = $("#userid").val();
						var realname = $("#realname").val();
						var cardnumber = $("#cardnumber").val();
						var datestart = $("#datestart").val();
						var dateend = $("#dateend").val();
						var phone = $("#phone").val();
						var accountype = $("#accountype option:selected").val();
						var idcard = $("#idcard option:selected").val();
						table.reload('query', {
						/* 	page: {
								curr: 1 //重新从第 1 页开始
								}, */
							method: 'get',
							where: {
								userid : userid,
								realname : realname,
								cardnumber : cardnumber,
								datestart : datestart,
								dateend :dateend,
								phone :phone,
								accountype :accountype,
								idcard :idcard
							}
						});
						return false;
					}
				};
			$('.layui-btn').on('click', function() {
				var type = $(this).data('type');
				active[type] ? active[type].call(this) : '';
			});
			//头工具栏事件
			table.on('toolbar(test)', function(obj) {
				var checkStatus = table.checkStatus(obj.config.id);
				switch (obj.event) {
					case 'getCheckData':
						var data = checkStatus.data;
						layer.alert(JSON.stringify(data));
						break;
					case 'getCheckLength':
						var data = checkStatus.data;
						layer.msg('选中了：' + data.length + ' 个');
						break;
					case 'isAll':
						layer.msg(checkStatus.isAll ? '全选' : '未全选');
						break;
					case 'deleteBySelect':
						var data = checkStatus.data;
						var arrId = new Array();//创建一个数组保存多个值
						for (var i = 0; i < data.length; i++) {
							arrId[i]=data[i].userid//获取当前选中的Id并保存到数组中
						}
						layer.confirm('是否注销该客户？', function(index) {
							alert(arrId)
							$.ajax({
								url: "/clientInfo/delMore",
								type: "get",
								traditional: true,
								data: {
									ids :arrId
								},
								dataType: "json",
								success: function(data) {
									obj.del();
								}
							});
							//关闭弹框
							window.location.reload(); //刷新页面
							layer.close(); //关闭当前页
						});
						break;
				};
			});
			//单击行勾选checkbox事件
			$(document).on("click", ".layui-table-body table.layui-table tbody tr", function() {
				var index = $(this).attr('data-index');
				var tableBox = $(this).parents('.layui-table-box');
				//存在固定列
				if (tableBox.find(".layui-table-fixed.layui-table-fixed-l").length > 0) {
					tableDiv = tableBox.find(".layui-table-fixed.layui-table-fixed-l");
				} else {
					tableDiv = tableBox.find(".layui-table-body.layui-table-main");
				}
				var checkCell = tableDiv.find("tr[data-index=" + index + "]").find("td div.laytable-cell-checkbox div.layui-form-checkbox I");
				if (checkCell.length > 0) {
					checkCell.click();
				}
			});
			$(document).on("click", "td div.laytable-cell-checkbox div.layui-form-checkbox", function(e) {
				e.stopPropagation();
			});
			//监听行工具事件
			table.on('tool(test)', function(obj) {
				var data = obj.data //获得当前行数据（json格式的键值对）
					,
					layEvent = obj.event //获得 lay-event 对应的值（编辑、删除、添加）
					,
					editList = []; //存放获取到的那条json数据中的value值（不放key）
				$.each(data, function(name, value) { //循环遍历json数据
					editList.push(value); //将json数据中的value放入数组中（下面的子窗口显示的时候要用到）
				});
				//console.log(obj)
				if (layEvent === 'edit') {
					layer.open({
						type: 2,
						title: '编辑员工信息',
						area: ['70%', '70%'],
						shadeClose: true,
						maxmin: true,
						offset: '15px',
						content: '${pageContext.request.contextPath}/clientInfo/queryAll?uid=' + data.userid, //设置你要弹出的jsp页面 
					});
					layer.msg('ID:' + data.userid + ' 的查看操作');
				}
			});
		});
	</script>

</body>

</html>