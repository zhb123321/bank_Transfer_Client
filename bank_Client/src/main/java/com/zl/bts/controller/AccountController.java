package com.zl.bts.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zl.bts.pojo.Account;
import com.zl.bts.service.impl.AccountServiceImpl;

@Controller
public class AccountController {

	@Autowired
	private AccountServiceImpl accImpl;

	@RequestMapping("/login")
	public String loginByPhone(Account user, HttpServletRequest request) {
		System.out.println("进入了控制器");
		System.out.println(user.getPhone() + user.getBpassword());
		Account acc = accImpl.login(user);
		System.out.println(acc);
		request.getSession().setAttribute("user", acc);
		if (acc == null) {
			return "login-pages/login";
		}
		return "/bank";
	}

	//ajax验证账户登入状态
	@RequestMapping("/ajax")
	@ResponseBody
	public Boolean ajax(Account user) {
		System.out.println("进入ajax");
		Account acc = accImpl.login(user);
		if(acc==null) {
			return false;
		}
		return true;
	}
	
	//跳转到行内转账页面
	@RequestMapping("/inbank")
	public String inbank(Account user, HttpServletRequest request) {
		System.out.println("进入行内转账");
		return "/bank/inBank";
	}
	
	

}
