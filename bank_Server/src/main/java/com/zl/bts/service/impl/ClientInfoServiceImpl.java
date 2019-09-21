package com.zl.bts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.ClientInfoDao;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.page;
import com.zl.bts.service.ClientInfoService;
@Service
public class ClientInfoServiceImpl implements ClientInfoService{
	@Autowired
	ClientInfoDao clientInfoDao;
	public List<Account> pageClientInfo(page qc) {
		return clientInfoDao.pageClientInfo(qc);
	}
	@Override
	public int delById(Integer id) {
		System.err.println(id);
		return clientInfoDao.del(id);
	}
	@Override
	public Account queryById(Integer uid) {
		return clientInfoDao.queryById(uid);
	}
	@Override
	public int updateAc(Account account) {
		return clientInfoDao. updateAc( account);
	}


}
