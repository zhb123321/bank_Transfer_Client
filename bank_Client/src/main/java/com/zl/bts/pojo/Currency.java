package com.zl.bts.pojo;

import java.math.BigDecimal;

public class Currency {
    private BigDecimal currencyid;

    private String currencyname;
 
    public BigDecimal getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(BigDecimal currencyid) {
        this.currencyid = currencyid;
    }

    public String getCurrencyname() {
        return currencyname;
    }

    public void setCurrencyname(String currencyname) {
        this.currencyname = currencyname == null ? null : currencyname.trim();
    }
}