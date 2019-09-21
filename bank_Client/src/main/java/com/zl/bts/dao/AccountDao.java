package com.zl.bts.dao;

import org.apache.ibatis.annotations.Mapper;

import com.zl.bts.pojo.Account;

@Mapper
public interface AccountDao {
	//登入验证
	public Account loginByPhone(Account a);
	//账户限额
	public int updataAccount(Long accountlimit);
}
