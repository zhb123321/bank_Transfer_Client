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
<title>跨行转账</title>
<link rel="stylesheet" href="/css/layui.css">
<script src="/js/layui.js"></script>

</head>
<body>
<form class="layui-form" action="/inter/check">
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
				<th>手续费用</th>
				<th>交易验证码</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>${ibt.inaccount}</td>
				<td>${ibt.outaccount}</td>
				<td>${ibt.username}</td>
				<td>人名币</td>
				<td>${ibt.bankname}</td>
				<td>${ibt.money}</td>
				<td>${bbg}</td>
				<td>0</td>
				<td><input type="text"></td>
			</tr>
		</tbody>
	</table>
	<!-- 付款账户 -->
	<input type="hidden" value="${ibt.inaccount}" name="inaccount" />
	<!-- 收款账户 -->
	<input type="hidden" value="${ibt.outaccount}" name="outaccount" />
	<!-- 交易金额 -->
	<input type="hidden" value="${ibt.money}" name="money" />
	<!-- 交易id -->
	<input type="hidden" value="${ibt.iid}" name="iid" />
	<div style="font-size: 14px; color: red">验证码将通过短信发送到您预留的手机号上,请注意查收!</div>
	<button value="0" name="0" class="layui-btn" lay-submit lay-filter="formDemo"
		style="margin-left: 500px;">确认</button>
	<button class="layui-btn" lay-submit lay-filter="formDemo">返回上一步</button>
</form>
</body>
</html>