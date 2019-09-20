<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>跨境转账</title>
    <link rel="stylesheet" href="/css/layui.css">
    <script src="/js/layui.js"></script>
</head>
<body>
<hr class="layui-bg-orange">
<div style="height: 100px;width: 100%">
    <ul style="margin-top: 30px;margin-left: 500px;font-size: 20px;color: #F68B38">
        <li>您的汇款交易受理成功!</li>

        <li>请注意对方账户到账情况,确认交易结果.</li>
    </ul>
</div>
<hr class="layui-bg-orange">

<div>本次转账信息</div>
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
        <td>${entity.fee}</td>
    </tr>
    </tbody>
</table>
<button class="layui-btn" lay-submit lay-filter="formDemo" style="margin-left: 550px;">打印</button>
<button class="layui-btn" lay-submit lay-filter="formDemo">返回</button>
</body>
</html>