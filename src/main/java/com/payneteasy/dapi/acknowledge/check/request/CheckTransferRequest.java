package com.payneteasy.dapi.acknowledge.check.request;

import com.payneteasy.dapi.acknowledge.general.InDestinationCard;
import com.payneteasy.dapi.acknowledge.general.InSourceCard;

public class CheckTransferRequest extends AbstractCheckRequest {
    private InDestinationCard destinationOfFunds;
    private InSourceCard sourceOfFunds;

    public InDestinationCard getDestinationOfFunds() {
        return destinationOfFunds;
    }

    public void setDestinationOfFunds(InDestinationCard destinationOfFunds) {
        this.destinationOfFunds = destinationOfFunds;
    }

    public InSourceCard getSourceOfFunds() {
        return sourceOfFunds;
    }

    public void setSourceOfFunds(InSourceCard sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }

}
