package com.zl.bts.service;

import java.util.List;

import com.zl.bts.pojo.CrossborderTransfer;
import com.zl.bts.pojo.Currency;

public interface CrossBorderService {

	List<Currency>  findCurrency();

	void insertCrossborderInfo(CrossborderTransfer crossborderTransfer);

	Long findMaxCid();

	CrossborderTransfer findCurrentInfo(Long max);
	
}
