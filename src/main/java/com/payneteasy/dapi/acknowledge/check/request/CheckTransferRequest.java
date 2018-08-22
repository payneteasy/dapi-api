package com.payneteasy.dapi.acknowledge.check.request;

import com.payneteasy.dapi.acknowledge.general.InDestinationCard;
import com.payneteasy.dapi.acknowledge.general.InSourceCard;

/**
 * Class is uses for security purposes and allows PaynetEasy to compare the data sent by Merchant’s app
 * with the data stored on Merchant’s server through check-transfer operations. PayneEasy sends HTTP request
 * to Merchant's acknowledge server with this structure.
 */
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
