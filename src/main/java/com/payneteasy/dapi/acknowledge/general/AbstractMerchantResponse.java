package com.payneteasy.dapi.acknowledge.general;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class AbstractMerchantResponse extends AbstractProxyErrorResponse {
    private OutSession session;
    private String invoiceId;

    public AbstractMerchantResponse(){}

    public AbstractMerchantResponse(Throwable e, String orderId){
        super(e, orderId);
    }

    @NotNull
    @Valid
    public OutSession getSession() {
        return session;
    }

    public void setSession(OutSession session) {
        this.session = session;
    }

    @NotNull
    public String getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        this.invoiceId = invoiceId;
    }
}
