<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>行内转账</title>
<link rel="stylesheet" href="/css/layui.css">
<script src="/js/layui.js"></script>
<script src="../js/jquery-1.8.3.js"></script>


</head>

<body style="overflow-y: auto; overflow-x: auto; height: 1000px;">
	<form class="layui-form" action="/iner/next" id="changeForm">

		<div>
			<label class="layui-form-label">付款账户</label>
			<div class="layui-input-inline">
				<select name="acardnumber" lay-verify="required" lay-search="">
					<option value="">直接选择或搜索选择</option>
					<option value="${acc.cardnumber}">${acc.cardnumber}</option>

				</select>
			</div>
			<div style="float: right; margin-top: 10px; font-size: 12px">需要选择付款账号，如需添加账户,请到营业网点办理新账户签约。</div>
		</div>
		<div
			style="font-size: 13px; margin-left: 120px; height: 30px; margin-top: 10px">*账户余额:${acc.money}</div>



		<div class="layui-form-item">
			<label class="layui-form-label">收款人账户</label>
			<div class="layui-input-block">
				<input id="cardnumber" type="text" name="cardnumber" required
					lay-verify="required" placeholder="请输入账户" autocomplete="off"
					class="layui-input" style="width: 220px">
			</div>
			<div
				style="font-size: 13px; margin-left: 120px; height: 30px; margin-top: 10px">收款账户不可为空</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">收款人姓名</label>
			<div class="layui-input-block">
				<input id="realname" type="text" name="realname" required
					lay-verify="required" placeholder="请输入姓名" autocomplete="off"
					class="layui-input" style="width: 220px">
			</div>
			<div
				style="font-size: 13px; margin-left: 120px; height: 30px; margin-top: 10px">币种:
				人民币元</div>
		</div>

		<div class="layui-form-item">
			<label class="layui-form-label">转账金额</label>
			<div class="layui-input-block">
				<input type="text" id="money" name="money" required
					lay-verify="required" placeholder="请输入金额" autocomplete="off"
					class="layui-input" style="width: 220px">
			</div>

			<div class="layui-form-item">
				<span style="margin-left: 120px">金额大写: <span id="money2"
					name="money2" style="font-size: 13px"></span></span>
			</div>
		</div>

		<div class="layui-form-item layui-form-text">
			<label class="layui-form-label">附言</label>
			<div class="layui-input-block">
				<textarea name="postscript" placeholder="请输入内容"
					class="layui-textarea"></textarea>
			</div>
		</div>


		<div class="layui-form-item">
			<label class="layui-form-label">短信通知</label>
			<div class="layui-input-block">
				<input type="checkbox" name="switch" lay-skin="switch">
			</div>
		</div>

		<label class="layui-form-label"></label>
		<div class="layui-input-block">
			<input type="radio" name="mode" value="1" title="极速到账"> <input
				type="radio" name="mode" value="2" title="当日到账" checked> <input
				type="radio" name="mode" value="3" title="隔日到账" checked>
		</div>
		<input type="hidden" value="${acc.money}" name="accmoney" /> <input
			type="hidden" value="${acc.userid}" name="userid" />
			<input type="hidden" id="bbg" value="" name="bbg" />
		<div class="layui-form-item">
			<div class="layui-input-block">
				<button id="next" class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
			</div>
		</div>
	</form>

	<script>
    //Demo

		layui.use('form', function() {
			var form = layui.form;
			form.render();
			
			//监听提交
			form.on('submit(formDemo)', function(data) {
				$("#changeForm").submit();
				return false;
			});
		});

</script>


	<script>
 $("#realname").blur(function(){
	var realname = $("#realname").val();//取值
	var cardnumber = $("#cardnumber").val();//取值
	$.ajax({
        url:"${pageContext.request.contextPath}/iner/find",
        data:{"realname":realname,"cardnumber":cardnumber},
        dataType:"json",
        success: function(date){
        	if(date){
        		alert("验证成功");	
        	}else{
        		$("#realname").val(""),
        		 $("#cardnumber").val(""),
        		alert("姓名与账号不符");
        	}
        }
    })
});  
</script>

	<script> 
$(function () {
    //转成大写
    $("#money").blur(function(){
  var moneynumber=$("#money").val();
   $.ajax({
          url:"${pageContext.request.contextPath}/active/upMoney",
          data:{"moneynumber":moneynumber},
          dataType:"text",
          success: function(result){
           //alert(result.chinese);
           $("#money2").text(result),
           $("#bbg").val(result);
          }
      })
      
      var moneynumber=$("#money").val();
	 if(moneynumber>${acc.money}){
		 $("#money").val(""),
		 alert("您输入的金额有误");
	 }
  });
});
</script>





</body>
</html>