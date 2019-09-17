<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>收款人查询</title>
		<link rel="stylesheet" href="/css/layui.css">
		 
	</head>
	<body>
		 
		<table class="layui-hide" id="test" lay-filter="test"></table>
		 
		<script type="text/html" id="toolbarDemo">
		  <div class="layui-btn-container">
		    <button class="layui-btn layui-btn-sm" lay-event="getCheckData">获取选中行数据</button>
		    <button class="layui-btn layui-btn-sm" lay-event="getCheckLength">获取选中数目</button>
		    <button class="layui-btn layui-btn-sm" lay-event="isAll">验证是否全选</button>
		  </div>
		</script>
		 
		<script type="text/html" id="barDemo">
		  <a class="layui-btn layui-btn-xs" lay-event="edit">编辑</a>
		  <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
		</script>
		              
		          
		<script src="/js/layui.js"></script>
		<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 --> 
		 
		<script>
		layui.use(['table', 'form', 'layedit', 'laydate', 'jquery'], function(){
		  var table = layui.table;
		  var form = layui.form,
					layer = layui.layer,
					layedit = layui.layedit,
					laydate = layui.laydate;
				var $ = layui.jquery;
		  form.render();
		  table.render({
		    elem: '#test'
		    ,url:'/material/list'
		    ,toolbar: '#toolbarDemo' //开启头部工具栏，并为其绑定左侧模板
		    ,defaultToolbar: ['filter', 'exports', 'print', { //自定义头部工具栏右侧图标。如无需自定义，去除该参数即可
		      title: '提示'
		      ,layEvent: 'LAYTABLE_TIPS'
		      ,icon: 'layui-icon-tips'
		    }]
		    ,title: '用户数据表'
		    ,height: 600
		    ,parseData: function(res) { //res 即为原始返回的数据
						return {
							"code": res.code, //解析接口状态
							"msg": res.msg, //解析提示文本
							"count": res.count, //解析数据长度
							"data": res.data //解析数据列表
						};
					}
			,id: 'contenttable'
		    ,cols: [[
		      {type: 'checkbox', fixed: 'left'}
		      ,{field:'id', title:'转账账户', width:80, fixed: 'left', unresize: true, sort: true}
		      ,{field:'username', title:'转账金额', width:120, edit: 'text'}
		      ,{field:'email', title:'转账类型', width:150, edit: 'text', templet: function(res){
		        return '<em>'+ res.email +'</em>'
		      }}
		      ,{field:'sex', title:'转账时间', width:80, edit: 'text', sort: true}
		      ,{field:'city', title:'交易单号', width:100}
		      ,{field:'sign', title:'交易状态'}
		      ,{field:'experience', title:'剩余金额', width:80, sort: true}
		      ,{field:'ip', title:'IP', width:120}
		      ,{field:'logins', title:'转入账户', width:100, sort: true}
		      ,{field:'joinTime', title:'备注', width:120}
		      ,{fixed: 'right', title:'操作', toolbar: '#barDemo', width:150}
		    ]]
		    ,page: true
		  });
		  
		  //头工具栏事件
		  table.on('toolbar(test)', function(obj){
		    var checkStatus = table.checkStatus(obj.config.id);
		    switch(obj.event){
		      case 'getCheckData':
		        var data = checkStatus.data;
		        layer.alert(JSON.stringify(data));
		      break;
		      case 'getCheckLength':
		        var data = checkStatus.data;
		        layer.msg('选中了：'+ data.length + ' 个');
		      break;
		      case 'isAll':
		        layer.msg(checkStatus.isAll ? '全选': '未全选');
		      break;
		      
		      //自定义头工具栏右侧图标 - 提示
		      case 'LAYTABLE_TIPS':
		        layer.alert('这是工具栏右侧自定义的一个图标按钮');
		      break;
		    };
		  });
		  
		  //监听行工具事件
		  table.on('tool(test)', function(obj){
		    var data = obj.data;
		    //console.log(obj)
		    if(obj.event === 'del'){
		      layer.confirm('是否确认删除选中项?', function(index){
		        obj.del();
		        layer.close(index);
		      });
		    } else if(obj.event === 'edit'){
		      layer.prompt({
		        formType: 2
		        ,value: data.email
		      }, function(value, index){
		        obj.update({
		          email: value
		        });
		        layer.close(index);
		      });
		    }
		  });
		});
		</script>
	</body>
</html>
