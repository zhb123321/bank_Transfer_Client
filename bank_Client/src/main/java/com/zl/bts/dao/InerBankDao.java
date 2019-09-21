package com.zl.bts.dao;

import org.apache.ibatis.annotations.Mapper;

import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InerbankTransfer;

@Mapper
public interface InerBankDao {

	public String findByNumber(Account a);

	// 获取当前交易订单号
	public Long findForNumber();

	// 生成用户交易单
	public void addIner(InerbankTransfer ibt);

	// 加钱
	public void ad(Account a);

	// 减钱
	public void de(Account a);

	// 修改交易状态
	public void zt(InerbankTransfer ibt);

	// 修改余额
	public void ye(InerbankTransfer ibt);

	// 修改最后操作事件
	public void lastTime(InerbankTransfer ibt);

}
