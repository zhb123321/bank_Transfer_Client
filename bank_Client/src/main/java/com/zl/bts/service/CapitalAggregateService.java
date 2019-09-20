package com.zl.bts.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.zl.bts.pojo.CaptialAggregate;

public interface CapitalAggregateService {
	public void addCapitalAggregate(CaptialAggregate ca);
	//获取id最大值
	public BigDecimal getMaxId();
	//查询行内资金归集签约单
	public List<CaptialAggregate> queryCapitalAggregateInLine(Map<String,Object> map);
	//查询跨行资金归集签约单
	public List<CaptialAggregate> queryCapitalAggregateOutLine(Map<String,Object> map);
	//查询行内资金归集签约单总数据量
	public Integer queryTotalCountInLine();
	//查询跨行资金归集签约单总数据量
	public Integer queryTotalCountOutLine();
	//批量删除
	public void updateDeleteType(Map<String,Object> map);
}
