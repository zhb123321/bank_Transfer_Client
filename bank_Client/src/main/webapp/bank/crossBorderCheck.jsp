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
</head>
<body>
<input type="hidden" value="${entity.cid}" id="cid"/>
<table class="layui-table">
    <colgroup>
        <col width="150">
        <col width="150">
        <col>
    </colgroup>
    <thead>
    <tr>
        <th>付款账户</th>
        <th>收款账户</th>
        <th>收款账户名称</th>
        <th>币种</th>
        <th>收款账户开户行</th>
        <th>交易金额</th>
        <th>大写金额</th>
        <th>交易验证码</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${entity.userid}</td>
        <td>${entity.reusernumber}</td>
        <td>${entity.reusername}</td>
        <td>${entity.currencyid}</td>
        <td>${entity.bankname}</td>
        <td>${entity.moneynumber}</td>
        <td>${money}</td>
        <td><input type="text" name="message_verifi" id="message_verifi">
            <span class="layui-icon layui-icon-ok" id="check_1" style="display:none"></span>
	        <span class="layui-icon layui-icon-close" id="check_2" style="display:none"></span></td>
    </tr>
    </tbody>
</table>
<div style="font-size: 14px;color: red">验证码将通过短信发送到您预留的手机号上,请注意查收!</div>
<button id="confirm_1" class="layui-btn" lay-submit lay-filter="formDemo" style="margin-left: 550px;">确定</button>
<button class="layui-btn" lay-submit lay-filter="formDemo">返回</button>
<script>	
layui.use('form', function() {
	var form = layui.form;
	form.render();
});
//查询收款账户信息
	$("#confirm_1").click(function(){
		var message=$("#message_verifi").val();
		var cid=$("#cid").val();
		$.ajax({	
	        url:"${pageContext.request.contextPath}/crossBorder/checkMessage",
	        data:{"message":message},
	        dataType:"json",
	        success: function(result){
	        	if(result.code=="0"){
	        		$("#check_1").show();
	        		window.location.href="${pageContext.request.contextPath}/successTransfer?cid="+cid;	
	        	}else{
	        		$("#check_2").show();
	        	}
	        }
	    })
	});
</script>
</body>
</html>