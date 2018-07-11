package com.payneteasy.dapi.acknowledge.cardref.response;

import com.payneteasy.dapi.acknowledge.general.AbstractMerchantResponse;

public class SendSaleCardReferenceResponse extends AbstractMerchantResponse {

    private SendSaleCardReferenceResponse(){}

    public SendSaleCardReferenceResponse(Throwable e, String orderId){
        super(e, orderId);
    }
}
