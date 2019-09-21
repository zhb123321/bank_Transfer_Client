package com.zl.bts.dao;

import java.util.List;

import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.page;

public interface ClientInfoDao {

	List<Account> pageClientInfo(page qc);

	Long test();

	int del(Integer id);

	Account queryById(Integer uid);

	int updateAc(Account account);

}
