package com.payneteasy.dapi.acknowledge.cardref.response;

import com.payneteasy.dapi.acknowledge.general.AbstractMerchantResponse;

public class SendCardReferenceResponse extends AbstractMerchantResponse {

    private SendCardReferenceResponse(){}

    public SendCardReferenceResponse(Throwable e, String orderId){
        super(e, orderId);
    }
}
