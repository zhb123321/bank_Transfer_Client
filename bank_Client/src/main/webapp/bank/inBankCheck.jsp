<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>行内转账</title>
    <link rel="stylesheet" href="/css/layui.css">
    <script src="/js/layui.js"></script>

</head>
<body>
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
        <td>************</td>
        <td>************</td>
        <td>张三</td>
        <td>人名币</td>
        <td>知领银行</td>
        <td>9999</td>
        <td>九千九百九十九</td>
        <td>99999</td>
        <td><input type="text"></td>
    </tr>

    </tbody>
</table>
<div style="font-size: 14px;color: red">验证码将通过短信发送到您预留的手机号上,请注意查收!</div>
<button class="layui-btn" lay-submit lay-filter="formDemo" style="margin-left: 500px;">确认</button>
<button class="layui-btn" lay-submit lay-filter="formDemo">返回上一步</button>

</body>
</html>