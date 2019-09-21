<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>账户限额</title>
		<meta name="renderer" content="webkit">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
		<link rel="stylesheet" href="/css/layui.css" media="all">
		</style>
	</head>

	<body style=" overflow-y:auto; overflow-x:auto; height:1000px;">
		<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
			<legend>账户限额</legend>
		</fieldset>
		<from class="layui-form">
			<div class="layui-form-item">
				<label class="layui-form-label">银行卡号:</label>
				<div class="layui-input-block" style="width: 220px;">
					<select name="cardnumber" id="card_number" lay-filter="relationship">
            	    <option value="">请选择银行卡号</option>
       				<option value="${w}">${w}</option>
          </select>余额：<label id="ye"></label>元
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">开通状态：</label>
				<div class="layui-input-block">
					<input type="radio" name="bj" value="0" title="开通" checked>
					<input type="radio" name="bj" value="1" title="关闭">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">支付密码：</label>
				<div class="layui-input-inline">
					<input type="password" name="bpassword" placeholder="请输入密码" autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">单笔交易限额：</label>
				<div class="layui-input-block">
					<input type="text" name="amountlimit" placeholder="请输入金额" class="layui-input" style="width: 220px;">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">手机号：</label>
				<div class="layui-input-block">
					<input type="text" name="phone" placeholder="请输入手机号" class="layui-input" style="width: 220px;">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">短信通知：</label>
				<div class="layui-input-block">
					<input type="checkbox" name="message" lay-skin="switch">
				</div>
			</div>
			<div class="layui-form-item">
				<div class="layui-input-block">
					<button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
				</div>
			</div>

		</from>
		<script src="/js/layui.js" charset="utf-8"></script>
		<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->

		<script>
			layui.use(['form','layer', 'jquery'], function() {
				var form = layui.form,
					layer = layui.layer;
				var $ = layui.jquery;
				form.render();
				
				form.on('submit(formDemo)', function(data) {				
				console.log(data.elem); //被执行事件的元素DOM对象，一般为button对象
				console.log(data.field); //当前容器的全部表单字段，名值对形式：{name: value}
				$.ajax({
				    type:"POST",
					url : "pc/zhxe",
					contentType : "application/json",
					data : JSON.stringify(data.field),
					success : function(date) { 
						 if(date=="success"){
						    alert(date);
						}  
					}
				})  
			
			});
			
			form.on('select(relationship)', function(data) {
				var elem = data.elem; //得到select原始DOM对象
				console.log(elem);
				console.log(data);
				$("#ye").html(data.value);
			
			});
				
				
			});
		</script>

	</body>

</html>