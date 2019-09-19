package com.zl.bts.dao;

import java.util.List;

import com.zl.bts.pojo.Currency;

public interface CrossBorderDao {

	List<Currency> findCurrency();

	Integer findUser(String username);

	Long findMoney();

	void CrossBorder();

	Long findCId();

}
