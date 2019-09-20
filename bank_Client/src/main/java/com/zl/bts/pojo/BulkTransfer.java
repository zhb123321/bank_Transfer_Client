package com.zl.bts.pojo;

import java.lang.Long;

public class BulkTransfer {
    private Long transactionid;

    private String transactiontype;

    private Long transactiontypeid;

    public Long getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(Long transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactiontype() {
        return transactiontype;
    }

    public void setTransactiontype(String transactiontype) {
        this.transactiontype = transactiontype == null ? null : transactiontype.trim();
    }

    public Long getTransactiontypeid() {
        return transactiontypeid;
    }

    public void setTransactiontypeid(Long transactiontypeid) {
        this.transactiontypeid = transactiontypeid;
    }
}