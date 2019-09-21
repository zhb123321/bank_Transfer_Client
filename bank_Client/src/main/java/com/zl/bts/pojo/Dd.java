package com.zl.bts.pojo;

import lombok.Data;
//批量转账中的转账人

public class Dd {
	//转账账号
	private String inaccount;
	private String type;
	//留言
	private String desc;
	private String message;

	public String getInaccount() {
		return inaccount;
	}
	public void setInaccount(String inaccount) {
		this.inaccount = inaccount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
