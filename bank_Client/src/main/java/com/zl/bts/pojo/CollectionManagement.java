package com.zl.bts.pojo;

import java.lang.Long;

public class CollectionManagement {
    private Long mid;

    private Long userid;

    private Long invoice;

    private Long currencyid;

    private Long money;

    private Long status;

    private Long transtype;

    private String datetime;

    private String bankname;

    private String username;

    private Long outaccount;

    private String uptime;

    private Long deletetype;

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getTranstype() {
        return transtype;
    }

    public void setTranstype(Long transtype) {
        this.transtype = transtype;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getOutaccount() {
        return outaccount;
    }

    public void setOutaccount(Long outaccount) {
        this.outaccount = outaccount;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public Long getDeletetype() {
        return deletetype;
    }

    public void setDeletetype(Long deletetype) {
        this.deletetype = deletetype;
    }
}