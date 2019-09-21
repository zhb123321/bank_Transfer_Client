package com.zl.bts.service;

import com.zl.bts.pojo.Account;

public interface AccountService {
	//登入验证
	public Account login(Account a);
	//账户限额
	public boolean updataAccount(Long amountlimit,Long cardnumber);
	//通过userid查银行卡号
	public Long select(Long uid);
}
