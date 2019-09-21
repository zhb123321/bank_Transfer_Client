package com.zl.bts.pojo;

import java.util.List;

public class layuiResult<T> {
	private String msg;
	private List<?> data;
	private int code;
	private long count;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}



	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}

	public layuiResult(String msg, List<?> data, int code, long l) {
		super();
		this.msg = msg;
		this.data = data;
		this.code = code;
		this.count = l;
	}

	
}
