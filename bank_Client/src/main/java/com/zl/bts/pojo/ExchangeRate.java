package com.zl.bts.pojo;

import java.lang.Long;

public class ExchangeRate {
    private Long exchangeyid;

    private Long currencyid;

    private String holdingcurrency;

    private String moneychanging;

    private Long exchangerate;

    public Long getExchangeyid() {
        return exchangeyid;
    }

    public void setExchangeyid(Long exchangeyid) {
        this.exchangeyid = exchangeyid;
    }

    public Long getCurrencyid() {
        return currencyid;
    }

    public void setCurrencyid(Long currencyid) {
        this.currencyid = currencyid;
    }

    public String getHoldingcurrency() {
        return holdingcurrency;
    }

    public void setHoldingcurrency(String holdingcurrency) {
        this.holdingcurrency = holdingcurrency == null ? null : holdingcurrency.trim();
    }

    public String getMoneychanging() {
        return moneychanging;
    }

    public void setMoneychanging(String moneychanging) {
        this.moneychanging = moneychanging == null ? null : moneychanging.trim();
    }

    public Long getExchangerate() {
        return exchangerate;
    }

    public void setExchangerate(Long exchangerate) {
        this.exchangerate = exchangerate;
    }
}