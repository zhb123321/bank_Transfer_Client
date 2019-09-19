package com.zl.bts.service;

import java.util.List;

import com.zl.bts.pojo.Currency;

public interface CrossBorderService {

	List<Currency> findCurrency();

	Integer findUser(String username);

	Long findMoney();

	void CrossBorder();

	Long findCrossBorderId();

}
