package com.payneteasy.dapi.acknowledge.check.request;

import com.payneteasy.dapi.acknowledge.general.InSourceCard;

/**
 * Class is uses for security purposes and allows PaynetEasy to compare the data sent by Merchant’s app
 * with the data stored on Merchant’s server through check-sale operations. PayneEasy sends HTTP request
 * to Merchant's acknowledge server with this structure.
 */
public class CheckSaleRequest extends AbstractCheckRequest {

    private InSourceCard sourceOfFunds;

    public InSourceCard getSourceOfFunds() {
        return sourceOfFunds;
    }

    public void setSourceOfFunds(InSourceCard sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }
}
