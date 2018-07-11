package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.OutCardDestination;

public interface IHasDestinationOfFunds {

    OutCardDestination getDestinationOfFunds();

    void setDestinationOfFunds(OutCardDestination destinationOfFunds);
}
