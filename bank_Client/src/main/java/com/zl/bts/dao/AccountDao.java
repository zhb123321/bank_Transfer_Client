package com.zl.bts.dao;


import org.apache.ibatis.annotations.Param;

import com.zl.bts.pojo.Account;


public interface AccountDao {
	//登入验证
	public Account loginByPhone(Account a);
	//账户限额
	public int updataAccount(@Param("amountlimit") Long amountlimit,@Param("cardnumber") Long cardnumber);
	//通过userid查银行卡号
	public Long select(Long uid);
}
