package com.zl.bts.pojo;


import java.io.Serializable;
import java.util.Date;

public class Personal implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8205662925471110851L;

	private Long userid;

    private String realname;

    private Long cardnumber;

    private String idcard;

    private Long apassowrd;

    private Long bpassword;

    private Date opendate;

    private Date iopendate;

    private String openplace;

    private String accountype;

    private String accountsubject;

    private String phone;

    private String house;

    private Long amountlimit;

    private String deletetype;

    private Date uptime;

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

    public Long getApassowrd() {
        return apassowrd;
    }

    public void setApassowrd(Long apassowrd) {
        this.apassowrd = apassowrd;
    }

    public Long getBpassword() {
        return bpassword;
    }

    public void setBpassword(Long bpassword) {
        this.bpassword = bpassword;
    }

    public Date getOpendate() {
        return opendate;
    }

    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    public Date getIopendate() {
        return iopendate;
    }

    public void setIopendate(Date iopendate) {
        this.iopendate = iopendate;
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

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
}