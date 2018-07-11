package com.payneteasy.dapi.acknowledge.check.request;

import com.payneteasy.dapi.acknowledge.general.InSourceCard;

public class CheckSaleRequest extends AbstractCheckRequest {

    private InSourceCard sourceOfFunds;

    public InSourceCard getSourceOfFunds() {
        return sourceOfFunds;
    }

    public void setSourceOfFunds(InSourceCard sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }
}
