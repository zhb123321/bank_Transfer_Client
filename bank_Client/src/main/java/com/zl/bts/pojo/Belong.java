package com.zl.bts.pojo;

import lombok.Data;

@Data
public class Belong {
	private	String area;//地区，注意不是所有卡都能返回area字段。
	private	String tel;//银行客服
	private	String brand;//银行卡产品名称
	private	String bankName;//银行名称
	private	String cardType;//银行卡种
	private	String url;//银行官网
	private	String cardNum;
}
