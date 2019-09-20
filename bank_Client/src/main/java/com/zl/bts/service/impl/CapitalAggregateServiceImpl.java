package com.zl.bts.service.impl;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.CapitalAggregateMapper;
import com.zl.bts.pojo.CaptialAggregate;
import com.zl.bts.service.CapitalAggregateService;
@Service
public class CapitalAggregateServiceImpl implements CapitalAggregateService{
	@Autowired
	private CapitalAggregateMapper dao;
	//新增签约单
	public void addCapitalAggregate(CaptialAggregate ca) {
		dao.addCapitalAggregate(ca);
	}
	//获取id最大值
	public BigDecimal getMaxId() {
		return dao.getMaxId();
	}
}
