package com.zl.bts.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.bts.dao.InterBankDao;
import com.zl.bts.pojo.Account;
import com.zl.bts.pojo.InterbankTransfer;
import com.zl.bts.service.InterBankService;

@Service
public class InterBankServiceImpl implements InterBankService {

	@Autowired
	private InterBankDao dao;

	@Override
	public Long findForNumber() {
		// 获取当前订单号
		Long number = dao.findForNumber();
		return number;
	}

	@Override
	public void addIner(InterbankTransfer ibt) {
		// 生成新的交易订单
		dao.addIner(ibt);

	}

	@Override
	public void de(Account a) {
		// 减钱
		dao.de(a);
		
	}

	@Override
	public void zt(InterbankTransfer ibt) {
		// 修改状态
		dao.zt(ibt);
	}

	@Override
	public void ye(InterbankTransfer ibt) {
		// 修改余额
		dao.ye(ibt);
		
	}

	@Override
	public void lastTime(InterbankTransfer ibt) {
		// 修改最后时间
		dao.lastTime(ibt);
		
	}

}
