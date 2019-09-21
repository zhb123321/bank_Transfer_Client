package com.zl.bts.service.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

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
	//查询行内资金归集签约单
	public List<CaptialAggregate> queryCapitalAggregateInLine(Map<String,Object> map){
		return dao.queryCapitalAggregateInLine(map);
	}
	//查询行内资金归集签约单总数据量
	public Integer queryTotalCountInLine() {
		return dao.queryTotalCountInLine();
	}
	
	//查询跨行资金归集签约单
	public List<CaptialAggregate> queryCapitalAggregateOutLine(Map<String,Object> map){
		return dao.queryCapitalAggregateOutLine(map);
	}
	
	//查询跨行资金归集签约单总数据量
	public Integer queryTotalCountOutLine() {
		return dao.queryTotalCountOutLine();
	}
	
	//批量删除
	public void updateDeleteType(Map<String,Object> map) {
		dao.updateDeleteType(map);
	}
}
