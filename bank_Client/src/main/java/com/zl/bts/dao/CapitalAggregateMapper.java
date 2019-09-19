package com.zl.bts.dao;

import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;

import com.zl.bts.pojo.CaptialAggregate;

@Mapper
public interface CapitalAggregateMapper {
	//新增签约单
	public void addCapitalAggregate(CaptialAggregate ca);
	//获取id最大值
	public BigDecimal getMaxId();
}
 