package com.zl.bts.pojo;

import lombok.Data;
//批量转账中的收款人

public class Ss {
		private long tempId;
		private String outaccount;//收款人账号
		private String username;//姓名
		private String bankname;//银行类型
		private String money;//金额
		public long getTempId() {
			return tempId;
		}
		public void setTempId(long tempId) {
			this.tempId = tempId;
		}
		public String getOutaccount() {
			return outaccount;
		}
		public void setOutaccount(String outaccount) {
			this.outaccount = outaccount;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public String getMoney() {
			return money;
		}
		public void setMoney(String money) {
			this.money = money;
		}
		
}
