package com.zl.bts.pojo;

import java.lang.Long;

public class ActiveCollection {
    private Long aid;

    private Long userid;

    private Long inaccount;

    private Long userphone;

    private Long moneynumber;

    private String username;

    private Long currencyid;

    private String payname;

    private Long payphone;

    private String message;

    private String deletetype;

    private String uptime;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
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

    public Long getUserphone() {
        return userphone;
    }

    public void setUserphone(Long userphone) {
        this.userphone = userphone;
    }

    public Long getMoneynumber() {
        return moneynumber;
    }

    public void setMoneynumber(Long moneynumber) {
        this.moneynumber = moneynumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public String getPayname() {
        return payname;
    }

    public void setPayname(String payname) {
        this.payname = payname == null ? null : payname.trim();
    }

    public Long getPayphone() {
        return payphone;
    }

    public void setPayphone(Long payphone) {
        this.payphone = payphone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
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