package com.zl.bts.pojo;

import java.lang.Long;

public class CrossborderTransfer {
    private Long cid;

    private Long userid;

    private String username;

    private String useraddr;

    private Long postcode;

    private Long userphone;

    private Long inaccount;

    private String bankname;

    private Long reusernumber;

    private String bankcountry;

    private String reusercountry;

    private Long currencyid;

    private String reusername;

    private Long exchangeyid;

    private Long moneynumber;

    private String message;

    private String datetime;

    private Long status;

    private Long fee;

    private Long service;

    private String deletetype;

    private String uptime;

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUseraddr() {
        return useraddr;
    }

    public void setUseraddr(String useraddr) {
        this.useraddr = useraddr == null ? null : useraddr.trim();
    }

    public Long getPostcode() {
        return postcode;
    }

    public void setPostcode(Long postcode) {
        this.postcode = postcode;
    }

    public Long getUserphone() {
        return userphone;
    }

    public void setUserphone(Long userphone) {
        this.userphone = userphone;
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

    public Long getReusernumber() {
        return reusernumber;
    }

    public void setReusernumber(Long reusernumber) {
        this.reusernumber = reusernumber;
    }

    public String getBankcountry() {
        return bankcountry;
    }

    public void setBankcountry(String bankcountry) {
        this.bankcountry = bankcountry == null ? null : bankcountry.trim();
    }

    public String getReusercountry() {
        return reusercountry;
    }

    public void setReusercountry(String reusercountry) {
        this.reusercountry = reusercountry == null ? null : reusercountry.trim();
    }

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public String getReusername() {
        return reusername;
    }

    public void setReusername(String reusername) {
        this.reusername = reusername == null ? null : reusername.trim();
    }

    public Long getExchangeyid() {
        return exchangeyid;
    }

    public void setExchangeyid(Long exchangeyid) {
        this.exchangeyid = exchangeyid;
    }

    public Long getMoneynumber() {
        return moneynumber;
    }

    public void setMoneynumber(Long moneynumber) {
        this.moneynumber = moneynumber;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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

    public Long getFee() {
        return fee;
    }

    public void setFee(Long fee) {
        this.fee = fee;
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
}