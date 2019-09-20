package com.zl.bts.service;

import java.math.BigDecimal;

import com.zl.bts.pojo.CaptialAggregate;

public interface CapitalAggregateService {
	public void addCapitalAggregate(CaptialAggregate ca);
	//获取id最大值
	public BigDecimal getMaxId();
}
