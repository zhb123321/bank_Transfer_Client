package com.zl.bts.controller;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InerbankTransfer;
import com.zl.bts.service.InerBankService;

@Controller
@RequestMapping("/iner")
public class InerbankTransferController {

	@Autowired
	private InerBankService ibs;

	// 账号验证
	@RequestMapping("/find")
	@ResponseBody
	public boolean findByNumber(Account a) {
		System.out.println(a.getRealname());
		System.out.println("进入到账号验证");
		String name = a.getRealname();
		String realname = ibs.findByNumber(a);
		System.out.println(realname);
		if (name.equals(realname)) {
			return true;

		}
		return false;

	}

	// 跳转到Check页面
	@RequestMapping("/next")
	public String inbank(HttpServletRequest request, Model model, String bbg) throws UnsupportedEncodingException {
		System.out.println("进入到跳转页面");
		request.setCharacterEncoding("UTF-8");
		// 交易单号
		Long nid = (ibs.findForNumber() + 1000);
		// 转出账户
		Long inaccount = Long.valueOf(request.getParameter("acardnumber"));
		// 转入账户
		Long outaccount = Long.valueOf(request.getParameter("cardnumber"));
		// 用户id
		Long userid = Long.valueOf(request.getParameter("userid"));
		// 收款人姓名
		String username = request.getParameter("realname");
		System.out.println(username);
		// 交易金额
		Long money = Long.valueOf(request.getParameter("money"));
		// 转入银行
		String bankname = "建设银行";
		// 获取金额大写
		// String bbg = request.getParameter("bbg");

		// 交易日期
		// 截取当前系统时间
		Date currentTime = new Date();
		// 改变输出格式（自己想要的格式）
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 得到字符串时间
		String datatime = formatter.format(currentTime);

		// 交易状态
		Long status = 2L;
		// 交易类型
		String transfertype = "1";
		// 当前余额
		Long money2 = Long.valueOf(request.getParameter("accmoney"));
		// 币种
		Long currencyid = 1L;
		// 执行方式
		String mode = request.getParameter("mode");
		// 附言
		String postscript = request.getParameter("postscript");
		// 人工服务
		Long service = 0L;
		// 表删除状态
		String deletetype = "0";

		InerbankTransfer ibt = new InerbankTransfer();
		ibt.setNid((long) nid);
		ibt.setBalance((money2 - money));
		ibt.setBankname(bankname);
		ibt.setCurrencyid(currencyid);
		ibt.setDatetime(datatime);
		ibt.setDeletetype(deletetype);
		ibt.setFee(0L);
		ibt.setInaccount(inaccount);
		ibt.setModel(mode);
		ibt.setMoney(money);
		ibt.setOutaccount(outaccount);
		ibt.setPostscript(postscript);
		ibt.setService(service);
		ibt.setStatus(status);
		ibt.setTransfertype(transfertype);
		ibt.setUptime(datatime);
		ibt.setUserid(userid);
		ibt.setUsername(username);

		ibs.addIner(ibt);

		model.addAttribute("ibt", ibt);
		model.addAttribute("bbg", bbg);
		System.out.println(bbg);

		return "/bank/inBankCheck";
	}

	// 跳转到确认订单页面
	@RequestMapping("/check")
	public String inbankCheck(HttpServletRequest request, Model model) {
		System.out.println("进入到跳转页面");
		// 转出账户
		Long inaccount = Long.valueOf(request.getParameter("inaccount"));
		// 转入账户
		Long outaccount = Long.valueOf(request.getParameter("outaccount"));
		// 交易金额
		Long money = Long.valueOf(request.getParameter("money"));
		System.out.println(money);
		// 交易id
		Long nid = Long.valueOf(request.getParameter("nid"));

		// 确认交易
		String a = request.getParameter("0");

		if (a != null) {
			// 交易成功 加钱 减钱 修改订单状态
			// 加钱账号
			Account ad = new Account();
			ad.setCardnumber(outaccount);
			ad.setMoney(money);
			ibs.ad(ad);
			// 减钱账号
			Account de = new Account();
			de.setCardnumber(inaccount);
			de.setMoney(money);
			ibs.de(de);
			// 修改状态码 3
			InerbankTransfer status = new InerbankTransfer();
			status.setStatus(3L);
			status.setNid(nid);
			ibs.zt(status);
			// 修改最后操作时间

			// 截取当前系统时间
			Date currentTime = new Date();
			// 改变输出格式（自己想要的格式）
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// 得到字符串时间
			String datatime = formatter.format(currentTime);

			InerbankTransfer lt = new InerbankTransfer();
			lt.setUptime(datatime);
			lt.setNid(nid);
			ibs.lastTime(lt);
		
			return "/bank/inBankSucess";
		} else {
			// 取消交易 更改余额 修改订单状态

			// 修改状态码 4
			InerbankTransfer status = new InerbankTransfer();
			status.setStatus(4L);
			status.setNid(nid);
			ibs.zt(status);
			// 改回账户余额
			InerbankTransfer ye = new InerbankTransfer();
			ye.setBalance(money);
			ye.setNid(nid);
			ibs.ye(ye);
			// 修改最后操作时间

			// 截取当前系统时间
			Date currentTime = new Date();
			// 改变输出格式（自己想要的格式）
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			// 得到字符串时间
			String datatime = formatter.format(currentTime);

			InerbankTransfer lt = new InerbankTransfer();
			lt.setUptime(datatime);
			lt.setNid(nid);
			ibs.lastTime(lt);

			return "/bank/inBank";
		}

	}
	
	// 跳转到确认订单页面
		@RequestMapping("/first")
		public String first() {
			
			
			return "/bank";
		}
	

}
