<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主动收款</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="/css/layui.css">
    <script src="/js/layui.js"></script>
</head>
<body style=" overflow-y:auto; overflow-x:auto; height:1000px;">

<form class="layui-form" action="">
<div style="background-color: #DFE6EE">
    <hr class="layui-bg-black">
    <div style="height: 25px;width: 100%;margin-left: 650px">
        收款人部分填写
    </div>
    <hr class="layui-bg-black">
</div>

<span style="margin-left: 25px">收款人姓名:<span>李梧桐</span></span>
<div style="width: 100%;height: 15px"></div>
    <div>
        <label class="layui-form-label">收款人账户</label>
        <div class="layui-input-inline">
            <select name="modules" lay-verify="required" lay-search="">
                <option value="">直接选择或搜索选择</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
            </select>
        </div>
    </div>
    <div style="font-size: 13px;margin-left: 120px;height: 30px;margin-top: 10px">币种: 人民币元</div>

    <div class="layui-form-item">
        <label class="layui-form-label">收款金额</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
        <div style="font-size: 13px;margin-left: 120px;height: 30px;margin-top: 10px">金额大写:</div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label" style="font-size: 13px">收款人手机号</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入号码" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>

        <div class="layui-form-item layui-form-text">
            <label class="layui-form-label">附言</label>
            <div class="layui-input-block">
                <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
            </div>
        </div>

        <div style="background-color: #DFE6EE">
            <hr class="layui-bg-black">
            <div style="height: 25px;width: 100%;margin-left: 650px">
                付款人部分填写
            </div>
            <hr class="layui-bg-black">
        </div>
    </div>

    <label class="layui-form-label" style="font-size: 13px">选择付款类型</label>
    <div class="layui-input-block">
        <input type="radio" name="sex" value="网上银行账户" title="网上银行账户">
        <input type="radio" name="sex" value="手机银行用户" title="手机银行用户" checked>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label">付款人姓名</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label" style="font-size: 13px">付款人手机号</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
    </div>

    <div class="layui-form-item">
        <label class="layui-form-label" style="font-size: 13px">付款人客户号</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
    </div>

    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>


</form>
<script>
    //Demo

    layui.use('form', function () {
        var form = layui.form;
        form.render();
        //监听提交
        form.on('submit(formDemo)', function (data) {
            layer.msg(JSON.stringify(data.field));
            return false;
        });
    });
</script>
</body>
</html>
