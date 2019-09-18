package com.zl.bts.pojo;

import lombok.Data;

@Data
public class ShowBody {
	private	String code;
	private	String msg;
	private	String ret_code;
	private	String error;
	private	Belong belong;
}
