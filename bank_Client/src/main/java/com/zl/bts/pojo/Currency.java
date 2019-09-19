package com.zl.bts.pojo;

//币种表

public class Currency {
    private Long currencyid;

    private String currencyname;

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname == null ? null : currencyname.trim();
    }
}