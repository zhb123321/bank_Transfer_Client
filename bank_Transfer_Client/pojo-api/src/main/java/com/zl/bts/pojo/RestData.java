package com.zl.bts.pojo;

import java.io.Serializable;

import lombok.Data;
@Data
public class RestData implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6035364880403419959L;
	private Boolean success;
	private String msg;

}
