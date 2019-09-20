package com.zl.bts.pojo;


public class ShowBody {
	private	String code;
	private	String msg;
	private	String ret_code;
	private	String error;
	private	Belong belong;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getRet_code() {
		return ret_code;
	}
	public void setRet_code(String ret_code) {
		this.ret_code = ret_code;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Belong getBelong() {
		return belong;
	}
	public void setBelong(Belong belong) {
		this.belong = belong;
	}
	@Override
	public String toString() {
		return "ShowBody [code=" + code + ", msg=" + msg + ", ret_code=" + ret_code + ", error=" + error + ", belong="
				+ belong + "]";
	}
	
}
