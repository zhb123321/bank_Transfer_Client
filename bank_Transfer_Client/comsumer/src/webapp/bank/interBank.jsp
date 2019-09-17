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
<body style=" overflow-y:auto; overflow-x:auto; height:1000px;">
<form class="layui-form" action="">
    <div>
        <label class="layui-form-label">付款账户</label>
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
        <div style="float: right;margin-top: 10px;font-size: 12px">需要选择付款账号，如需添加账户,请到营业网点办理新账户签约。</div>
    </div>
    <div style="font-size: 13px;margin-left: 120px;height: 30px;margin-top: 10px">*账户余额:</div>

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
        <div style="float: right;margin-top: 10px;font-size: 12px">收款账户不可为空，您可以直接输入账户，也可以点击“下拉框”选择收款账户</div>
    </div>
    <div style="font-size: 13px;margin-left: 120px;height: 20px;margin-top: 10px"></div>

    <div class="layui-form-item">
        <label class="layui-form-label">收款人姓名</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入姓名" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
    </div>

    <div>
        <label class="layui-form-label">收款银行</label>
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
        <label class="layui-form-label">转账金额</label>
        <div class="layui-input-block">
            <input type="text" name="title" required lay-verify="required" placeholder="请输入金额" autocomplete="off"
                   class="layui-input" style="width: 220px">
        </div>
        <div style="font-size: 13px;margin-left: 120px;height: 30px;margin-top: 10px">金额大写:</div>
    </div>

    <div class="layui-form-item layui-form-text">
        <label class="layui-form-label">附言</label>
        <div class="layui-input-block">
            <textarea name="desc" placeholder="请输入内容" class="layui-textarea"></textarea>
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
        <input type="radio" name="sex" value="极速到账" title="极速到账">
        <input type="radio" name="sex" value="当日到账" title="当日到账" checked>
        <input type="radio" name="sex" value="隔日到账" title="隔日到账" checked>
    </div>


    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="formDemo">下一步</button>
        </div>
    </div>
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