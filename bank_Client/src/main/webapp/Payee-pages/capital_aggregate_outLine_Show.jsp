<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>跨行资金归集签约单展示</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="/css/layui.css" media="all">
		</style>
	</head>

	<body>				
			<table class="layui-hide" id="test" lay-filter="test"></table>
			<script type="text/html" id="toolbarDemo">
				<div class="layui-btn-container">
					<button class="layui-btn layui-btn-sm" lay-event="deleteBySelect">删除选中的行数</button>
					<button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
					
				</div>
			</script>

			<script type="text/html" id="barDemo">
				<a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
			</script>

		</from>
		<script src="/js/layui.js" charset="utf-8"></script>
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
				table.render({
					elem: '#test',
					url: '/cac/showCapitalAggregateOutLine',
					toolbar: '#toolbarDemo',
					title: '用户数据表',
					limit: '5',
					limits: [5, 10, 20, 30],
					height: 300,
					id: 'contenttable',
					request: {
						pageName: 'page' //页码的参数名称，默认：page
							,
						limitName: 'limit' //每页数据量的参数名，默认：limit
					},
					parseData: function(res) { //res 即为原始返回的数据
						return {
							"code": res.code, //解析接口状态
							"msg": res.msg, //解析提示文本
							"count": res.count, //解析数据长度
							"data": res.data //解析数据列表
						};
					},
					cols: [
						[{
							type: 'checkbox',
							fixed: 'center'
						}, {
							field: 'inaccount',
							title: '主账户账号',
							minwidth: 80,
							unresize: true,
							sort: true
						}, {
							field: 'username',
							title: '主账户持卡人',
							minwidth: 120
						}, {
							field: 'inbankname',
							title: '主账户开户行',
							minwidth: 150
						}, {
							field: 'username',
							title: '归集账户持卡人',
							minwidth: 150
						}, {
							field: 'aggregatetype',
							title: '归集方式',
							minwidth: 150
						}, {
							field: 'aggregatedate',
							title: '归集周期',
							minwidth: 150
						}, {
							field: 'balanceupper',
							title: '归集账户保留金额',
							minwidth: 150
						}, {
							field: 'signingstatus',
							title: '审核状态',
							minwidth: 150
						}]
					],
					page: true
				});
				//搜索框的参数获取
				var $ = layui.$,
					active = {
						reload: function() {
							var keyNum = $("#keyNum").val();
							var keyWord = $("#keyWord").val();
							var keyType = $("#key_type option:selected").val();
							table.reload('contenttable', {
								method: 'get',
								where: {
									keyWord: keyWord,
									keyNum: keyNum,
									keyType: keyType
								}
							});
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
							var ids = [];
							for (var i = 0; i < data.length; i++) {
								ids.push(data[i].mid);
							}
							layer.confirm('真的删除选中的么？', function(index) {
								$.ajax({
									url: "/material/delete",
									type: "get",
									data: {
										"mid": JSON.stringify(ids)
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
							content: '${pageContext.request.contextPath}/material/edit?mid=' + data.mid, //设置你要弹出的jsp页面 
						});
						layer.msg('ID：' + data.mid + ' 的查看操作');
					}
				});
			});
		</script>

	</body>

</html>