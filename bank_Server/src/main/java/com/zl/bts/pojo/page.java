package com.zl.bts.pojo;

import java.io.Serializable;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
//查询条件
@Data
public class page implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8302988121914360927L;
		private Long userid;
	    private String realname;
	    private Long cardnumber;
	    private String idcard;
		private String accountype;
		private String datestart;
		private String dateend;
	    private String phone;
		private int page;
		private Long status;
}
