package com.zl.bts.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.CrossBorderDao;
import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.Currency;
import com.zl.bts.service.CrossBorderService;

@Service
public class CrossBorderServiceImpl implements CrossBorderService {
	@Autowired
	private CrossBorderDao crossBorderDao;

	@Override
	public List<Currency> findCurrency() {
		List<Currency> currency = crossBorderDao.selectCurrency();
		return currency;
	}

	@Override
	public void insertCrossborderInfo(CrossborderTransfer crossborderTransfer) {
		crossBorderDao.insertSelective(crossborderTransfer);
	}

	@Override
	public Long findMaxCid() {
		return crossBorderDao.selectMaxCid();
	}


	

}
