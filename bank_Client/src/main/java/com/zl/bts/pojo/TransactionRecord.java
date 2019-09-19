package com.zl.bts.pojo;
import java.sql.Date;

import lombok.Data;
@Data
public class TransactionRecord {
	    private long tid;
		private Integer userid;//账户编号
		private String realname;//汇款姓名
		private String inaccount;//汇款账号
		private String phone;//汇款手机号码
		private String Invoice;//交易发票号码
		private Integer currencyid;//交易币种
		private String money;//交易金额
		private Integer status;//交易状态
		private Integer transtype;//交易类型
		private String datatime;//交易时间
		private String bankname;//收款银行
		private String username;//收款姓名
		private String outaccount;//收款账号
		private String uptime;//操作时间
		private Integer deletetype;//删除状态		
}

