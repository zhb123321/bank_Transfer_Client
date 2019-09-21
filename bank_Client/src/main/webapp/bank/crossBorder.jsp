<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>跨境转账</title>
<link rel="stylesheet" href="/css/layui.css">
<script src="/js/layui.js"></script>
<script src="/js/jquery-1.8.3.js"></script>
<script>	
$(function () {
	//查询收款账户信息
 	$("#reusernumber").blur(function(){
 		var reusername=$("#reusername").val();
		var reusernumber=$("#reusernumber").val();
		var reuserphone=$("#reuserphone").val();
		var reuseridcard=$("#reuseridcard").val();
 		$.ajax({
 	        url:"${pageContext.request.contextPath}/crossBorder/checkreuser",
 	        data:{"reusername":reusername,"reusernumber":reusernumber,"reuserphone":reuserphone,"reuseridcard":reuseridcard},
 	        dataType:"json",
 	        success: function(result){
 	        	if(result.showapi_res_code=="0"){
 	        		$("#check_1").show();
 	        	}else{
 	        		$("#check_2").show();
 	        	}
 	        }
 	    })
 	});
 	//查询汇款账户信息
 	$("#userid").blur(function(){
 		var username=$("#username").val();
		var userid=$("#userid").val();
		var userphone=$("#userphone").val();
		var useridcard=$("#useridcard").val();
 		$.ajax({
 	        url:"${pageContext.request.contextPath}/crossBorder/checkuser",
 	        data:{"username":username,"userid":userid,"userphone":userphone,"useridcard":useridcard},
 	        dataType:"json",
 	        success: function(result){
 	        	if(result.showapi_res_code=="0"){
 	        		$("#check_3").show();
 	        	}else{
 	        		$("#check_4").show();
 	        	}
 	        }
 	    })
 	});
	
});
</script>
</head>
<body style=" overflow-y:auto; overflow-x:auto; height:2400px;">

	<form class="layui-form" action="/crossBorder/insertCrossBorder" id="changeForm">
		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写收款人信息</div>
			<hr class="layui-bg-black">
		</div>
		
		<div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">收款人姓名</label>
					<input type="text" name="reusername" id="reusername" lay-verify="required"
						placeholder="请输入姓名(英文或拼音)" autocomplete="off" class="layui-input"
					style="width: 220px">
					
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">收款人手机</label>
			<div class="layui-input-block">
				<input type="text" name="reuserphone" id="reuserphone" lay-verify="required"
					placeholder="请输入手机" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	    <div class="layui-inline">
	     <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">收款人身份证</label>
			<div class="layui-input-block">
				<input type="text" name="reuseridcard" id="reuseridcard" lay-verify="required"
					placeholder="请输入身份证" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	    <div class="layui-inline">
	    <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">收款人账号</label>
			<div class="layui-input-block">
				<input type="text" name="reusernumber" id="reusernumber" lay-verify="required"
					placeholder="请输入账号" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok" id="check_1" style="display:none"></span>
	       <span class="layui-icon layui-icon-close" id="check_2" style="display:none"></span>
	    </div>
	  </div>
	  
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">收款银行所在国家(地区)</label>
			<div class="layui-input-inline">
				<select lay-verify="required"  name="bankcountry">
					<option value="">请选择国家</option>
					<option value="中国">中国</option>
					<option value="美国">美国</option>
					<option value="日本">日本</option>
					<option value="英国">英国</option>
					<option value="韩国">韩国</option>
				</select>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">收款银行全称</label>
			<div class="layui-input-block">
				<input type="text" name="bankname" lay-verify="required"
					placeholder="请输入银行全称" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	     <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok" ></span>
	    </div>
	  </div>
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">币种:</label>
			<div class="layui-input-inline">
				<select lay-verify="required"  name="currencyid" >
					<option value="">直接选择或搜索选择</option>
					<c:forEach items="${currencylist}" var="list">
					<option value="${list.currencyid}">${list.currencyname}</option>
					</c:forEach> 
				</select>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  

		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写汇款人信息</div>
			<hr class="layui-bg-black">
		</div>
	
		
		<div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">汇款人姓名</label>
					<input type="text" name="username" id="username" lay-verify="required"
						placeholder="请输入姓名(英文或拼音)" autocomplete="off" class="layui-input"
					style="width: 220px">
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">汇款人手机</label>
			<div class="layui-input-block">
				<input type="text" name="userphone" id="userphone" lay-verify="required"
					placeholder="请输入手机" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">汇款人身份证</label>
			<div class="layui-input-block">
				<input type="text" name="useridcard" id="useridcard" lay-verify="required"
					placeholder="请输入身份证" autocomplete="off" class="layui-input"
					style="width: 220px">
			<span style="margin-left: 35px ;color:red;" id="msg"></span>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  
	  
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">汇款人账号</label>
					<input type="text" name="userid" id="userid" lay-verify="required"
						placeholder="请输入姓名(英文或拼音)" autocomplete="off" class="layui-input"
					style="width: 220px">
	    </div>
	    <div class="layui-inline">
	       <span class="layui-icon layui-icon-ok" id="check_3" style="display:none"></span>
	       <span class="layui-icon layui-icon-close" id="check_4" style="display:none"></span>
	    </div>
	  </div>
	  
	  
	  
		
		
		<span style="margin-left: 20px">国家地区: <span>China(中国)</span></span><br />
		
		<div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">详细地址:</label>
			<div class="layui-input-block">
				<textarea placeholder="请输入内容" class="layui-textarea" name="useraddr"></textarea>
			</div>
			<div style="margin-left: 110px;font-size: 13px;color: red">请填写详细地址,必须详细到门牌号,否则将影响您的款项的汇出</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
		

	<div class="layui-form-item">
	    <div class="layui-inline">
	     <label class="layui-form-label">邮政编码</label>
			<div class="layui-input-block">
				<input type="text" name="postcode" required lay-verify="required"
					placeholder="汇款人邮政编码" autocomplete="off" class="layui-input"
					style="width: 220px">
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  

		<div style="background-color: #DFE6EE">
			<hr class="layui-bg-black">
			<div style="height: 25px;width: 100%;margin-left: 650px">
				请您填写交易信息</div>
			<hr class="layui-bg-black">
		</div>
		
		
	  <div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">汇款金额</label>
				<input type="text" name="moneynumber" required lay-verify="required"
					placeholder="请输入金额" autocomplete="off" class="layui-input"
					style="width: 220px">
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  
	  
	  <div class="layui-form-item">
	    <div class="layui-inline">
	      <label class="layui-form-label">收费标准：</label>
	      <label class="layui-form-label">12元</label>
	    </div>
	  </div>

		<span style="margin-left: 35px">国内外费用承担方式: SHA 共同承担 <span
			style="color:red;">跨境汇款可能产生中转费用</span></span>

		<div style="height: 15px"></div>
		
		 <div class="layui-form-item">
	   		 <div class="layui-inline">
	     	 <label class="layui-form-label">汇款币种:</label>
				<div class="layui-input-inline">
				<select name="modules" lay-verify="required" lay-search="1" name="currencyid">
					<c:forEach items="${currencylist}" var="list">
					<option value="${list.currencyid}">${list.currencyname}</option>
					</c:forEach> 
				</select>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>


		<div class="layui-form-item">
	   		 <div class="layui-inline">
	     	<label class="layui-form-label">给收款方的汇款附言</label>
			<div class="layui-input-block">
				<textarea name="message" placeholder="请输入内容" class="layui-textarea"></textarea>
			</div>
			<div style="margin-left: 110px;font-size: 13px;color: red">请用英文如实填写您的汇款用途/原因,如未如实填写,可能导致收款人无法顺利收到汇款</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>


		<div class="layui-form-item">
	   		 <div class="layui-inline">
	     	<label class="layui-form-label">收款人常驻国家</label>
				<div class="layui-input-inline">
				<select  lay-verify="required" lay-search="1" name="reusercountry">
					<option value="">请选择国家</option>
					<option value="中国">中国</option>
					<option value="美国">美国</option>
					<option value="日本">日本</option>
					<option value="英国">英国</option>
					<option value="韩国">韩国</option>
				</select>
			</div>
	    </div>
	    <div class="layui-inline">
	      <span class="layui-icon layui-icon-ok"></span>
	    </div>
	  </div>
	  

		<div style="height: 50px"></div>
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button class="layui-btn" lay-submit="" lay-filter="formDemo" >下一步</button>
				<button type="reset" class="layui-btn layui-btn-primary">重置</button>
			</div>
		</div>
	</form>


	<script>

		layui.use('form', function() {
			var form = layui.form;
			form.render();
			
			//监听提交
			form.on('submit(formDemo)', function(data) {
				$("#changeForm").submit();
				//location.href="/crossBorder/checkCrossBorder";
				return false;
			});
		});

</script>
</body>
</html>