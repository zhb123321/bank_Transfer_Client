package com.zl.bts.pojo;
import java.sql.Date;

import lombok.Data;

public class TransactionRecord {
	    private long tid;
		private Integer userid;//账户编号
		private String realname;//汇款姓名
		private String inaccount;//汇款账号
		private String phone;//汇款手机号码
		private String Invoice;//交易发票号码
		private Integer currencyid;//交易币种
		private String money;//交易金额
		private Integer status;//交易状态
		private Integer transtype;//交易类型
		private String datatime;//交易时间
		private String bankname;//收款银行
		private String username;//收款姓名
		private String outaccount;//收款账号
		private String uptime;//操作时间
		private Integer deletetype;//删除状态		
		public long getTid() {
			return tid;
		}
		public void setTid(long tid) {
			this.tid = tid;
		}
		public Integer getUserid() {
			return userid;
		}
		public void setUserid(Integer userid) {
			this.userid = userid;
		}
		public String getRealname() {
			return realname;
		}
		public void setRealname(String realname) {
			this.realname = realname;
		}
		public String getInaccount() {
			return inaccount;
		}
		public void setInaccount(String inaccount) {
			this.inaccount = inaccount;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getInvoice() {
			return Invoice;
		}
		public void setInvoice(String invoice) {
			Invoice = invoice;
		}
		public Integer getCurrencyid() {
			return currencyid;
		}
		public void setCurrencyid(Integer currencyid) {
			this.currencyid = currencyid;
		}
		public String getMoney() {
			return money;
		}
		public void setMoney(String money) {
			this.money = money;
		}
		public Integer getStatus() {
			return status;
		}
		public void setStatus(Integer status) {
			this.status = status;
		}
		public Integer getTranstype() {
			return transtype;
		}
		public void setTranstype(Integer transtype) {
			this.transtype = transtype;
		}
		public String getDatatime() {
			return datatime;
		}
		public void setDatatime(String datatime) {
			this.datatime = datatime;
		}
		public String getBankname() {
			return bankname;
		}
		public void setBankname(String bankname) {
			this.bankname = bankname;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getOutaccount() {
			return outaccount;
		}
		public void setOutaccount(String outaccount) {
			this.outaccount = outaccount;
		}
		public String getUptime() {
			return uptime;
		}
		public void setUptime(String uptime) {
			this.uptime = uptime;
		}
		public Integer getDeletetype() {
			return deletetype;
		}
		public void setDeletetype(Integer deletetype) {
			this.deletetype = deletetype;
		}
		
		
}

