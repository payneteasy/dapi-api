package com.payneteasy.dapi.acknowledge.cardref.response;

import com.payneteasy.dapi.acknowledge.general.AbstractMerchantResponse;

/**
 * Class is uses in card mapping transfer requests for allow Consumer credentials
 * (phone, email, billing address, twitter name, etc) for mapping to card data.
 * Merchant's acknowledge server should respond to PaynetEasy with current structure.
 */
public class SendTransferCardReferencesResponse extends AbstractMerchantResponse {

    private SendTransferCardReferencesResponse(){}

    public SendTransferCardReferencesResponse(Throwable e, String orderId){
        super(e, orderId);
    }
}
