package com.payneteasy.dapi.acknowledge.cardref.response;

import com.payneteasy.dapi.acknowledge.general.AbstractMerchantResponse;

public class SendTransferCardReferencesResponse extends AbstractMerchantResponse {

    private SendTransferCardReferencesResponse(){}

    public SendTransferCardReferencesResponse(Throwable e, String orderId){
        super(e, orderId);
    }
}
