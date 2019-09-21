package com.zl.bts.pojo;

import java.lang.Long;

public class InerbankTransfer {
    private Long nid;

    private Long userid;

    private Long inaccount;

    private String bankname;

    private Long outaccount;

    private String username;

    private Long money;

    private String datetime;

    private Long status;

    private String transfertype;

    private Long balance;

    private Long fee;

    private Long currencyid;

    private String model;

    private String postscript;

    private Long service;

    private String deletetype;

    private String uptime;

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getInaccount() {
        return inaccount;
    }

    public void setInaccount(Long inaccount) {
        this.inaccount = inaccount;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public Long getOutaccount() {
        return outaccount;
    }

    public void setOutaccount(Long outaccount) {
        this.outaccount = outaccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getTransfertype() {
        return transfertype;
    }

    public void setTransfertype(String transfertype) {
        this.transfertype = transfertype == null ? null : transfertype.trim();
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
    }

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getPostscript() {
        return postscript;
    }

    public void setPostscript(String postscript) {
        this.postscript = postscript == null ? null : postscript.trim();
    }

    public Long getService() {
        return service;
    }

    public void setService(Long service) {
        this.service = service;
    }

    public String getDeletetype() {
        return deletetype;
    }

    public void setDeletetype(String deletetype) {
        this.deletetype = deletetype == null ? null : deletetype.trim();
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

	@Override
	public String toString() {
		return "InerbankTransfer [nid=" + nid + ", userid=" + userid + ", inaccount=" + inaccount + ", bankname="
				+ bankname + ", outaccount=" + outaccount + ", username=" + username + ", money=" + money
				+ ", datetime=" + datetime + ", status=" + status + ", transfertype=" + transfertype + ", balance="
				+ balance + ", fee=" + fee + ", currencyid=" + currencyid + ", model=" + model + ", postscript="
				+ postscript + ", service=" + service + ", deletetype=" + deletetype + ", uptime=" + uptime + "]";
	}
    
}