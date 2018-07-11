package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.OutSourceCard;

public interface IHasSourceOfFunds {

    OutSourceCard getSourceOfFunds();

    void setSourceOfFunds(OutSourceCard sourceOfFunds);
}
