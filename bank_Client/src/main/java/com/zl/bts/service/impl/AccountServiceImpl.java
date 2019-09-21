package com.zl.bts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.AccountDao;
import com.zl.bts.pojo.Account;
import com.zl.bts.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountDao dao;
	
	@Override
	public Account login(Account a) {
		//登入验证
		Account account = new Account();
		account = dao.loginByPhone(a);
		return account;
	}

	@Override
	public boolean updataAccount(Long amountlimit,Long cardnumber) {
		int a = dao.updataAccount(amountlimit,cardnumber);
		return a>0;
	}


}
