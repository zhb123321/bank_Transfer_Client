package com.zl.bts.service;

import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InterbankTransfer;

public interface InterBankService {

	// 获取当前交易订单号
	public Long findForNumber();

	// 生成新的跨行交易订单
	public void addIner(InterbankTransfer ibt);

	// 减钱
	public void de(Account a);

	// 修改交易状态
	public void zt(InterbankTransfer ibt);

	// 修改余额
	public void ye(InterbankTransfer ibt);

	// 修改最后操作事件
	public void lastTime(InterbankTransfer ibt);

}
