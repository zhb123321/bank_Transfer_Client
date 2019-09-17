<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
		<title>银行客户端管理系统</title>
		<link rel="stylesheet" href="/css/layui.css">
		<script src="/js/jquery-1.8.3.js"></script>
	</head>

	<body class="layui-layout-body">
		<div class="layui-layout layui-layout-admin">
			<div class="layui-header layui-bg-blue" id="sss" name="sss">
				<div class="layui-logo" style="color: white;">银行客户端管理系统</div>
				<ul class="layui-nav layui-layout-left ">
					<li class="layui-nav-item">
						<a class="" href="javascript:;">单笔转账</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" data-id="1" data-title="行内转账" data-url="bank/inBank.jsp" class="site-demo-active" data-type="tabAdd">行内转账</a></dd>
							<dd><a href="javascript:;" data-id="2" data-title="跨行转账" data-url="bank/interBank.jsp" class="site-demo-active" data-type="tabAdd">跨行转账</a></dd>
							<dd><a href="javascript:;" data-id="3" data-title="跨境转账" data-url="bank/crossBorder.jsp" class="site-demo-active" data-type="tabAdd">跨境转账</a></dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">账户限额</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" data-id="4" data-title="在线支付管理" data-url="Transaction-pages/zhxe.jsp" class="site-demo-active" data-type="tabAdd">在线支付管理</a></dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">收款</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" data-id="5" data-title="主动收款" data-url="bank/activeCheck.jsp" class="site-demo-active" data-type="tabAdd">主动收款</a>
							</dd>
							<dd><a href="javascript:;" data-id="6" data-title="收款人管理" data-url="Payee-pages/Cashier.jsp" class="site-demo-active" data-type="tabAdd">收款人管理</a>
							</dd>
							<dd><a href="javascript:;" data-id="15" data-title="添加收款人" data-url="bank/active.jsp" class="site-demo-active" data-type="tabAdd">添加收款人</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">行内资金归集</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-id="7" data-title="行内签约" data-url="Payee-pages/capital_aggregate_inLine_Signing.jsp" class="site-demo-active" data-type="tabAdd">签约
											      	 				</a>
							</dd>
							<dd>
								<a href="javascript:;" data-id="8" data-title="查看行内签约" data-url="Payee-pages/capital_aggregate_inLine_Show.jsp" class="site-demo-active" data-type="tabAdd">查看签约
											      	 				</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">跨行资金归集</a>
						<dl class="layui-nav-child">
							<dd>
								<a href="javascript:;" data-id="9" data-title="跨行签约" data-url="Payee-pages/capital_aggregate_outLine_Signing.jsp" class="site-demo-active" data-type="tabAdd">签约
											      	 				</a>
							</dd>
							<dd>
								<a href="javascript:;" data-id="10" data-title="查看跨行签约" data-url="Payee-pages/capital_aggregate_outLine_Show.jsp" class="site-demo-active" data-type="tabAdd">查看签约
											      	 				</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">批量转账</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" data-id="11" data-title="自选批量转账" data-url="bank/plzz.jsp" class="site-demo-active" data-type="tabAdd">自选批量转账</a>
							</dd>
						</dl>
					</li>
					<li class="layui-nav-item">
						<a href="javascript:;">账单明细</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" data-id="12" data-title="我的交易记录" data-url="Transaction-pages/transactionnote.jsp" class="site-demo-active" data-type="tabAdd">我的交易记录</a>
							</dd>
							<dd><a href="javascript:;" data-id="13" data-title="历史转账记录" data-url="Transaction-pages/Finshed.jsp" class="site-demo-active" data-type="tabAdd">历史转账记录</a>
							</dd>
							<dd><a href="javascript:;" data-id="14" data-title="未完成转账记录" data-url="Transaction-pages/Unfinshed.jsp" class="site-demo-active" data-type="tabAdd">未完成转账记录</a>
							</dd>
						</dl>
					</li>

				</ul>

				<ul class="layui-nav layui-layout-right">
					<li class="layui-nav-item">
						<a href="javascript:;">
         张三
        </a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;">基本资料</a></dd>
							<dd><a href="javascript:;">安全设置</a></dd>
						</dl>
					</li>
					<li class="layui-nav-item"><a href="javascript:;">注销                                              </a></li>
					<li class="layui-nav-item layui-hide-xs" lay-unselect>
						<a href="javascript:;" layadmin-event="theme">
							<i class="layui-icon layui-icon-theme"></i>
						</a>
						<dl class="layui-nav-child">
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-orange">橙色</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-red">赤色</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-green">墨绿</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-cyan">藏青</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-blue">蓝色</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-black">雅黑</a></dd>
							<dd><a href="javascript:;" onclick="gaib(this.name)" name="layui-bg-gray">银灰</a></dd>
						</dl>
					</li>
				</ul>
			</div>
			<!--tab标签-->
			<div class="layui-tab" lay-filter="demo" lay-allowclose="true" style="margin-left: 0px;">
				<ul class="layui-tab-title"></ul>
				<div class="layui-tab-content"></div>
			</div>

			<div class="layui-footer">
				<!-- 底部固定区域 -->
				MooZi开发
			</div>
		</div>

		<script src="/js/layui.js"></script>
		<script type="application/javascript">
			function gaib(a) {
				var s = $("#sss").attr("class");
				var ss = s.split(" ");
				//$("#sss").addClass("layui-bg-gray");
				if (a == "layui-bg-gray") {
					$("#sss").removeClass(ss[1]);
					$("#sss").addClass(a);
					$("a").css("color", "black");
					$(".layui-logo").css("color", "black");
				} else {
					$("#sss").removeClass(ss[1]);
					$("#sss").addClass(a);
					$("ul li a").css("color", "white");
					$("ul li dl dd a").css("color", "black");
					$(".layui-logo").css("color", "white");
				}
			}
		</script>
		<script>
			//JavaScript代码区域
			layui.use('element', function() {
				var element = layui.element;
			});
			//实现右侧窗口的显示
			layui.use(['element', 'layer', 'jquery'], function() {
				var element = layui.element;
				// var layer = layui.layer;
				var $ = layui.$;
				// 配置tab实践在下面无法获取到菜单元素
				$('.site-demo-active').on('click', function() {
					var dataid = $(this);
					//这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
					if ($(".layui-tab-title li[lay-id]").length <= 0) {
						//如果比零小，则直接打开新的tab项
						active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
					} else {
						//否则判断该tab项是否以及存在
						var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
						$.each($(".layui-tab-title li[lay-id]"), function() {
							//如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
							if ($(this).attr("lay-id") == dataid.attr("data-id")) {
								isData = true;
							}
						})
						if (isData == false) {
							//标志为false 新增一个tab项
							active.tabAdd(dataid.attr("data-url"), dataid.attr("data-id"), dataid.attr("data-title"));
						}
					}
					//最后不管是否新增tab，最后都转到要打开的选项页面上
					active.tabChange(dataid.attr("data-id"));
				});
				var active = {
					//在这里给active绑定几项事件，后面可通过active调用这些事件
					tabAdd: function(url, id, name) {
						//新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
						//关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分
						element.tabAdd('demo', {
							title: name,
							content: '<iframe data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:99%;"></iframe>',
							id: id //规定好的id
						})
						FrameWH(); //计算ifram层的大小
					},
					tabChange: function(id) {
						//切换到指定Tab项
						element.tabChange('demo', id); //根据传入的id传入到指定的tab项
					},
					tabDelete: function(id) {
						element.tabDelete("demo", id); //删除
					}
				};

				function FrameWH() {
					var h = $(window).height();
					$("iframe").css("height", h + "px");
				}
			});
		</script>

	</body>

</html>