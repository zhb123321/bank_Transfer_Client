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
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.service.InterBankService;

@Controller
@RequestMapping("/inter")
public class InterBankController {

	@Autowired
	private InterBankService ibs;

	// 账号验证
	@RequestMapping("/find")
	@ResponseBody
	public Boolean findByNumber(String realname, String cardnumber, String phone) {
		System.out.println("进入验证");

		System.out.println(realname + cardnumber + phone);
		if (realname.equals("") || cardnumber.equals("") || phone.equals("")) {
			return false;
		}
		return true;
	}

	// 跳转到Check页面
	@RequestMapping("/next")
	public String inbank(HttpServletRequest request, Model model, String bbg) throws UnsupportedEncodingException {
		System.out.println("进入到跳转页面");
		request.setCharacterEncoding("UTF-8");
		// 交易单号
		Long iid = (ibs.findForNumber()+1002);
		// 账户编号
		Long userid = Long.valueOf(request.getParameter("userid"));
		// 转出账户
		Long inaccount = Long.valueOf(request.getParameter("acardnumber"));
		//转入账户所属银行
		String bankname = "农商银行";
		//转入账户开户行
		String bankname2 = "江西农商银行";
		// 转入账户
		Long outaccount = Long.valueOf(request.getParameter("reusernumber"));
		// 收款人姓名
		String username = request.getParameter("reusername");
		// 交易金额
		Long money = Long.valueOf(request.getParameter("money"));

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

		InterbankTransfer ibt = new InterbankTransfer();
		ibt.setBalance(money2-money);
		ibt.setBankname(bankname);
		ibt.setBankname2(bankname2);
		ibt.setCurrencyid(1L);
		ibt.setDatetime(datatime);
		ibt.setDeletetype("0");
		ibt.setFee(0L);
		ibt.setIid(iid);
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
		System.out.println("iid"+ibt.getIid());

		model.addAttribute("ibt", ibt);
		model.addAttribute("bbg", bbg);
		System.out.println(bbg);

		return "/bank/interBankCheck";
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
			Long iid = Long.valueOf(request.getParameter("iid"));
			System.out.println(iid);

			// 确认交易
			String a = request.getParameter("0");

			if (a != null) {
				// 交易成功 加钱 减钱 修改订单状态
				// 减钱账号
				Account de = new Account();
				de.setCardnumber(inaccount);
				de.setMoney(money);
				ibs.de(de);
				// 修改状态码 3
				InterbankTransfer status = new InterbankTransfer();
				status.setStatus(3L);
				status.setIid(iid);
				ibs.zt(status);
				// 修改最后操作时间

				// 截取当前系统时间
				Date currentTime = new Date();
				// 改变输出格式（自己想要的格式）
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				// 得到字符串时间
				String datatime = formatter.format(currentTime);

				InterbankTransfer lt = new InterbankTransfer();
				lt.setUptime(datatime);
				lt.setIid(iid);
				ibs.lastTime(lt);
			
				return "/bank/inBankSucess";
			} else {
				// 取消交易 更改余额 修改订单状态

				// 修改状态码 4
				InterbankTransfer status = new InterbankTransfer();
				status.setStatus(4L);
				status.setIid(iid);
				ibs.zt(status);
//				// 改回账户余额
//				InterbankTransfer ye = new InterbankTransfer();
//				ye.setBalance(money);
//				ye.setIid(iid);
//				ibs.ye(ye);
//				// 修改最后操作时间

				// 截取当前系统时间
				Date currentTime = new Date();
				// 改变输出格式（自己想要的格式）
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				// 得到字符串时间
				String datatime = formatter.format(currentTime);

				InterbankTransfer lt = new InterbankTransfer();
				lt.setUptime(datatime);
				lt.setIid(iid);
				ibs.lastTime(lt);

				return "/bank/interBank";
			}

		}
	
	
	
	

}
