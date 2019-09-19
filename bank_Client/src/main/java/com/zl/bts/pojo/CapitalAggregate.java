package com.zl.bts.pojo;

import java.math.BigDecimal;

public class CapitalAggregate {
    private BigDecimal capitalid;

    private BigDecimal outaccount;

    private String username;

    private String outbankname;

    private BigDecimal inaccount;

    private String inbankname;

    private String aggregatetype;

    private String aggregatedate;

    private BigDecimal balanceupper;

    private BigDecimal balancelower;

    private String aggregaterule;

    private String signingstatus;

    private String deletetype;

    private String uptime;

    public BigDecimal getCapitalid() {
        return capitalid;
    }

    public void setCapitalid(BigDecimal capitalid) {
        this.capitalid = capitalid;
    }

    public BigDecimal getOutaccount() {
        return outaccount;
    }

    public void setOutaccount(BigDecimal outaccount) {
        this.outaccount = outaccount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getOutbankname() {
        return outbankname;
    }

    public void setOutbankname(String outbankname) {
        this.outbankname = outbankname == null ? null : outbankname.trim();
    }

    public BigDecimal getInaccount() {
        return inaccount;
    }

    public void setInaccount(BigDecimal inaccount) {
        this.inaccount = inaccount;
    }

    public String getInbankname() {
        return inbankname;
    }

    public void setInbankname(String inbankname) {
        this.inbankname = inbankname == null ? null : inbankname.trim();
    }

    public String getAggregatetype() {
        return aggregatetype;
    }

    public void setAggregatetype(String aggregatetype) {
        this.aggregatetype = aggregatetype == null ? null : aggregatetype.trim();
    }

    public String getAggregatedate() {
        return aggregatedate;
    }

    public void setAggregatedate(String aggregatedate) {
        this.aggregatedate = aggregatedate == null ? null : aggregatedate.trim();
    }

    public BigDecimal getBalanceupper() {
        return balanceupper;
    }

    public void setBalanceupper(BigDecimal balanceupper) {
        this.balanceupper = balanceupper;
    }

    public BigDecimal getBalancelower() {
        return balancelower;
    }

    public void setBalancelower(BigDecimal balancelower) {
        this.balancelower = balancelower;
    }

    public String getAggregaterule() {
        return aggregaterule;
    }

    public void setAggregaterule(String aggregaterule) {
        this.aggregaterule = aggregaterule == null ? null : aggregaterule.trim();
    }

    public String getSigningstatus() {
        return signingstatus;
    }

    public void setSigningstatus(String signingstatus) {
        this.signingstatus = signingstatus == null ? null : signingstatus.trim();
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