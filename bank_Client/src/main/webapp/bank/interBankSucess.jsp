<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
<hr class="layui-bg-orange">
<div style="height: 100px;width: 100%">
    <ul style="margin-top: 30px;margin-left: 500px;font-size: 20px;color: #F68B38">
        <li>您的汇款交易受理成功!</li>

        <li>请注意对方账户到账情况,确认交易结果.</li>
    </ul>
</div>
<hr class="layui-bg-orange">


<button class="layui-btn" lay-submit lay-filter="formDemo" style="margin-left: 550px;">打印</button>
<button class="layui-btn" lay-submit lay-filter="formDemo">返回</button>
</body>
</html>