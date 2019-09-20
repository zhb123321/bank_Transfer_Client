<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>layui</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="/css/layui.css" media="all">
<style type="text/css">
.layui-table-box {
	　　overflow: visible;
}

.layui-table-body {
	　　overflow: visible;
}

/* 防止下拉框的下拉列表被隐藏---必须设置--- */
.layui-table-cell {
	overflow: visible !important;
}
/* 使得下拉框与单元格刚好合适 */
td .layui-form-select {
	margin-top: -10px;
	margin-left: -15px;
	margin-right: -15px;
}
</style>
</head>

<body style=" overflow-y:auto; overflow-x:auto; height:1200px;">
	<fieldset class="layui-elem-field layui-field-title"
		style="margin-top: 20px;">
		<legend>批量转账</legend>
	</fieldset>
	<from class="layui-form">
	<div class="layui-form-item">
		<label class="layui-form-label">银行卡号:</label>
		<div class="layui-input-block" style="width: 220px;">
			<select name="keyType" id="key_type" lay-filter="relationship">
				<option value="">请选择银行卡号</option>
				<option value="${list.fname}"></option>
			</select>余额：元
		</div>
	</div>
	<div class="layui-form-item">
		<div id="tableRes" class="table-overlay">
			<table class="layui-hide" id="test" lay-filter="test"></table>
		</div>
	</div>

	<div class="layui-form-item">
		<label class="layui-form-label">总金额： 元</label>
	</div>
	<div class="layui-form-item layui-form-text">
		<label class="layui-form-label">附言</label>
		<div class="layui-input-block">
			<textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
		</div>
	</div>

	<div class="layui-form-item">
		<label class="layui-form-label">短信通知</label>
		<div class="layui-input-block">
			<input type="checkbox" name="switch" lay-skin="switch">
		</div>
	</div>
	<div class="layui-form-item">
		<div class="layui-input-block">
			<button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
		</div>
	</div>

	<script type="text/html" id="toolbarDemo">
		<div class="layui-btn-container">
			<button class="layui-btn layui-btn-sm" lay-event="deleteBySelect">删除选中的行数</button>
			<button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
			<button class="layui-btn layui-btn-sm" lay-event="addCheckData">增加一行数据</button>
            <button class="layui-btn layui-btn-sm" lay-event="addData">导入excle数据</button>
		</div>
	</script> </from>
	<script src="/js/layui.js" charset="utf-8"></script>
	<script src="/js/jquery-1.8.3.js" charset="utf-8"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

	<script type="text/javascript">
		window.viewObj = {
			tbData : [ {
				tempId : new Date().valueOf(),
				standard : '',
				mname : '',
				num : 2,
				price : ''
			} ],
			typeData : [
				{
					id : 1,
					name : '分类一'
				},
				{
					id : 2,
					name : '分类二'
				},
				{
					id : 3,
					name : '分类三'
				},
				{
					id : 4,
					name : '分类四'
				}
			],
			renderSelectOptions : function(data, settings) {
				settings = settings || {};
				var valueField = settings.valueField || 'value',
					textField = settings.textField || 'text',
					selectedValue = settings.selectedValue || "";
				var html = [];
				for (var i = 0, item; i < data.length; i++) {
					item = data[i];
					html.push('<option value="');
					html.push(item[valueField]);
					html.push('"');
					if (selectedValue && item[valueField] == selectedValue) {
						html.push(' selected="selected"');
					}
					html.push('>');
					html.push(item[textField]);
					html.push('</option>');
				}
				console.log(html.join(''));
				return html.join('');
			}
		};
	
	
		layui.use([ 'table', 'form', 'layer', 'jquery' ], function() {
			var table = layui.table;
			var form = layui.form,
				layer = layui.layer;
			var $ = layui.jquery;
	
			var tt = table.render({
				elem : '#test',
				toolbar : '#toolbarDemo',
				data : viewObj.tbData,
				title : '用户数据表',
				loading : true,
				limit : '5	',
				limits : [ 5, 10, 20, 30 ],
				height : 300,
				even : false, //不开启隔行背景
				id : 'contenttable',
				request : {
					pageName : 'page', //页码的参数名称，默认：page
					limitName : 'limit' //每页数据量的参数名，默认：limit
				},
				cols : [
					[ {
						field : 'standard',
						title : '收款人账户',
						unresize : true,
						edit : 'text',
						sort : true
					}, {
						field : 'mname',
						title : '收款人姓名',
						edit : 'text'
					}, {
						field : 'num',
						title : '收款银行',
						templet : function(d) {
							var options = viewObj.renderSelectOptions(viewObj.typeData, {
								valueField : "id",
								textField : "name",
								selectedValue : d.num
							});
							return '<a lay-event="type"></a><select name="type" lay-filter="type"><option value="">请选择分类</option>' + options + '</select>';
						}
					}, {
						field : 'price',
						title : '转账金额',
						edit : 'text'
					}, {
						field : 'tempId',
						title : '操作',
						templet : function(d) {
							return '<a class="layui-btn layui-btn-xs layui-btn-danger" lay-event="del" lay-id="' + d.tempId + '"><i class="layui-icon layui-icon-delete"></i>移除</a>';
						}
					} ]
				],
				page : true,
				done : function(res, curr, count) {
					console.log(res.data);
					viewObj.tbData = res.data;
					form.render("select");
				}
			});
			form.render();
	
			//监听select下拉选中事件
			form.on('select(type)', function(data) {
				var elem = data.elem; //得到select原始DOM对象
				console.log(elem);
				$(elem).prev("a[lay-event='type']").trigger("click");
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
				case 'addCheckData':
					var tableBak = table.cache["contenttable"];
					console.log(tableBak);
					//获取之前编辑过的全部数据，前提是编辑数据是要更新缓存，stock_add_table 为表格的id	
					tableBak.push({
						tempId : new Date().valueOf(),
						"standard" : "",
						"mname" : "",
						"num" : "",
						"price" : ""
					});
					console.log(tableBak);
					tt.reload({
						data : tableBak // 将新数据重新载入表格
					})
					break;
				case 'deleteBySelect':
					var data = checkStatus.data;
					var ids = [];
					for (var i = 0; i < data.length; i++) {
						ids.push(data[i].mid);
					}
					layer.confirm('真的删除选中的么？', function(index) {
						$.ajax({
							url : "/material/delete",
							type : "get",
							data : {
								"mid" : JSON.stringify(ids)
							},
							dataType : "json",
							success : function(data) {
								obj.del();
							}
						});
						//关闭弹框
						window.location.reload(); //刷新页面
						layer.close(); //关闭当前页
					});
					break;
				}
				;
			});
	
			form.on('submit(formDemo)', function(data) {
				var tableBak = table.cache["contenttable"];
				console.log(data.elem); //被执行事件的元素DOM对象，一般为button对象
				console.log(data.field); //当前容器的全部表单字段，名值对形式：{name: value}
				console.log(tableBak);
				var jsonda={
					"dd":data.field,
					"ss":tableBak	
				}
				$.ajax({
				    type:"POST",
                    async:false,
					url : "pc/plzz",
					contentType : "application/json",
					dataType : "json",
					data : JSON.stringify(jsonda),
					success : function(date) {
						
					},
				})
				return false;
			});
	
	
		/* //单击行勾选checkbox事件
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
		}); */
		/* $(document).on("click", "td div.laytable-cell-checkbox div.layui-form-checkbox", function(e) {
			e.stopPropagation();
		}); */
		//监听行工具事件
		/* table.on('tool(test)', function(obj) {
			var data = obj.data, //获得当前行数据（json格式的键值对）
		
				layEvent = obj.event, //获得 lay-event 对应的值（编辑、删除、添加）
		
				editList = []; //存放获取到的那条json数据中的value值（不放key）
			console.log(data);
			console.log(layEvent);
			//console.log(obj)
			if (layEvent === 'edit') {
				layer.open({
					type : 2,
					title : '编辑员工信息',
					area : [ '70%', '70%' ],
					shadeClose : true,
					maxmin : true,
					offset : '15px',
					content : '${pageContext.request.contextPath}/material/edit?mid=' + data.mid, //设置你要弹出的jsp页面 
				});
				layer.msg('ID：' + data.mid + ' 的查看操作');
			}
		}); */
		});
	</script>

</body>

</html>