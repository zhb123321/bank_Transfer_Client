package com.zl.bts.pojo;

import lombok.Data;
//批量转账中的收款人
@Data
public class Ss {
		private long tempId;
		private String outaccount;//收款人账号
		private String username;//姓名
		private String bankname;//银行类型
		private String money;//金额
}
