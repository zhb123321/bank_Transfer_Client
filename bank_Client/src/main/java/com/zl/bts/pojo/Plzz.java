package com.zl.bts.pojo;

import java.util.List;

import lombok.Data;


public class Plzz {
	private Dd dd;
	private List<Ss> ss;
	public Dd getDd() {
		return dd;
	}
	public void setDd(Dd dd) {
		this.dd = dd;
	}
	public List<Ss> getSs() {
		return ss;
	}
	public void setSs(List<Ss> ss) {
		this.ss = ss;
	}
	
}
