package com.zl.bts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.CrossBorderDao;
import com.zl.bts.pojo.Currency;
import com.zl.bts.service.CrossBorderService;

@Service
public class CrossBorderServiceImpl implements CrossBorderService {
	@Autowired
	private CrossBorderDao crossBorderDao;

	public List<Currency> findCurrency() {
		return crossBorderDao.findCurrency();
	}

	public Integer findUser(String username) {

		return crossBorderDao.findUser(username);
	}

	public Long findMoney() {

		return crossBorderDao.findMoney();
	}

	public Long findCrossBorderId() {
		return crossBorderDao.findCId();
	}
	
	public void CrossBorder() {
		crossBorderDao.CrossBorder();
		
	}

	

}
