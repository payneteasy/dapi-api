package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.AbstractMerchantResponse;
import com.payneteasy.dapi.acknowledge.general.OutTransaction;

import javax.validation.Valid;

public abstract class AbstractCheckResponse extends AbstractMerchantResponse {
    private OutTransaction transaction;

    AbstractCheckResponse(){}

    AbstractCheckResponse(Throwable e, String orderId){
        super(e, orderId);
    }

    @Valid
    public OutTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(OutTransaction transaction) {
        this.transaction = transaction;
    }
}
