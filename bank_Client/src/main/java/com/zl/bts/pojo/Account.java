package com.zl.bts.pojo;

import java.lang.Long;

public class Account {
    private Long userid;

    private String realname;

    private Long cardnumber;

    private String idcard;

    private Long apassword;

    private Long bpassword;

    private String opendate;

    private String iopendate;

    private String openplace;

    private String accountype;

    private String accountsubject;

    private String phone;

    private String house;

    private Long amountlimit;

    private String deletetype;

    private String uptime;

    private Long money;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Long getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(Long cardnumber) {
        this.cardnumber = cardnumber;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public Long getApassword() {
        return apassword;
    }

    public void setApassword(Long apassword) {
        this.apassword = apassword;
    }

    public Long getBpassword() {
        return bpassword;
    }

    public void setBpassword(Long bpassword) {
        this.bpassword = bpassword;
    }

    public String getOpendate() {
        return opendate;
    }

    public void setOpendate(String opendate) {
        this.opendate = opendate == null ? null : opendate.trim();
    }

    public String getIopendate() {
        return iopendate;
    }

    public void setIopendate(String iopendate) {
        this.iopendate = iopendate == null ? null : iopendate.trim();
    }

    public String getOpenplace() {
        return openplace;
    }

    public void setOpenplace(String openplace) {
        this.openplace = openplace == null ? null : openplace.trim();
    }

    public String getAccountype() {
        return accountype;
    }

    public void setAccountype(String accountype) {
        this.accountype = accountype == null ? null : accountype.trim();
    }

    public String getAccountsubject() {
        return accountsubject;
    }

    public void setAccountsubject(String accountsubject) {
        this.accountsubject = accountsubject == null ? null : accountsubject.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house == null ? null : house.trim();
    }

    public Long getAmountlimit() {
        return amountlimit;
    }

    public void setAmountlimit(Long amountlimit) {
        this.amountlimit = amountlimit;
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

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}