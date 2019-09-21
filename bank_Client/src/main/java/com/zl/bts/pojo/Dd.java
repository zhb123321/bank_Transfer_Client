package com.zl.bts.pojo;

import lombok.Data;
//批量转账中的转账人
@Data
public class Dd {
	//转账账号
	private String inaccount;
	private String type;
	//留言
	private String desc;
	private String message;
}
