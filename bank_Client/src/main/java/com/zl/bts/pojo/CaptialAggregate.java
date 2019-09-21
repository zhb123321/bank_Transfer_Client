package com.zl.bts.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;

public class CaptialAggregate implements Serializable {

	private static final long serialVersionUID = 1L;

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
		this.username = username;
	}

	public String getOutbankname() {
		return outbankname;
	}

	public void setOutbankname(String outbankname) {
		this.outbankname = outbankname;
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
		this.inbankname = inbankname;
	}

	public String getAggregatetype() {
		return aggregatetype;
	}

	public void setAggregatetype(String aggregatetype) {
		this.aggregatetype = aggregatetype;
	}

	public String getAggregatedate() {
		return aggregatedate;
	}

	public void setAggregatedate(String aggregatedate) {
		this.aggregatedate = aggregatedate;
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
		this.aggregaterule = aggregaterule;
	}

	public String getSigningstatus() {
		return signingstatus;
	}

	public void setSigningstatus(String signingstatus) {
		this.signingstatus = signingstatus;
	}

	public String getDeletetype() {
		return deletetype;
	}

	public void setDeletetype(String deletetype) {
		this.deletetype = deletetype;
	}

	public String getUptime() {
		return uptime;
	}

	public void setUptime(String uptime) {
		this.uptime = uptime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



   
}
