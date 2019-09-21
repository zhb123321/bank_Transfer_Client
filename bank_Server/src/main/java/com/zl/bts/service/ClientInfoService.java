package com.zl.bts.service;

import java.util.List;

import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.page;

public interface ClientInfoService {

	List<Account> pageClientInfo(page qc);

	int delById(Integer id);

	Account queryById(Integer uid);

	int updateAc(Account account);



}
