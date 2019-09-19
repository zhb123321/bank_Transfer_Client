package com.zl.bts.pojo;

import java.lang.Long;

public class BankStatement {
    private Long bankid;

    private String bankname;

    public Long getBankid() {
        return bankid;
    }

    public void setBankid(Long bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname == null ? null : bankname.trim();
    }
}