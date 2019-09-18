package com.zl.bts.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
@Data
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

   
}
