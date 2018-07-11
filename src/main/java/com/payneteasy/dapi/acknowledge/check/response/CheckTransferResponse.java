package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.OutCardDestination;
import com.payneteasy.dapi.acknowledge.general.OutConsumer;
import com.payneteasy.dapi.acknowledge.general.OutSourceCard;

import javax.validation.Valid;

public class CheckTransferResponse extends AbstractCheckResponse implements IHasSourceOfFunds, IHasDestinationOfFunds {
    private OutConsumer consumer;
    private OutCardDestination destinationOfFunds;
    private OutSourceCard sourceOfFunds;

    private CheckTransferResponse(){}

    public CheckTransferResponse(Throwable e, String orderId){
        super(e, orderId);
    }

    @Valid
    public OutConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(OutConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    @Valid
    public OutCardDestination getDestinationOfFunds() {
        return destinationOfFunds;
    }

    @Override
    public void setDestinationOfFunds(OutCardDestination destinationOfFunds) {
        this.destinationOfFunds = destinationOfFunds;
    }

    @Valid
    @Override
    public OutSourceCard getSourceOfFunds() {
        return sourceOfFunds;
    }

    @Override
    public void setSourceOfFunds(OutSourceCard sourceOfFunds) {
        this.sourceOfFunds = sourceOfFunds;
    }

    public boolean hasDestination() {
        return getDestinationOfFunds() != null;
    }

    public boolean hasSource() {
        return getSourceOfFunds() != null;
    }

    public Long getSourceCardRefId() {
        return hasSource() ? sourceOfFunds.getCardRefId() : null;
    }

    public Long getDestinationCardRefId() {
        return hasDestination() ? destinationOfFunds.getCardRefId() : null;
    }

    public boolean hasConsumer() {
        return consumer != null;
    }

    public boolean hasSufficientSourceCardData() {
        if (!hasSource()) {
            return false;
        }
        boolean hasDataViaReference = getSourceOfFunds().hasReference() && getSourceOfFunds().getCardRefId() != null;
        boolean hasDataViaFullCardData = getSourceOfFunds().hasCard()
                && getSourceOfFunds().getCard().getNumber() != null
                && !getSourceOfFunds().getCard().getNumber().trim().isEmpty()
                && getSourceOfFunds().getCard().getSecurityCode() != null
                && !getSourceOfFunds().getCard().getSecurityCode().trim().isEmpty()
                && getSourceOfFunds().getCard().hasExpiry()
                && getSourceOfFunds().getCard().hasHolder();
        return hasDataViaReference || hasDataViaFullCardData;
    }

    public boolean hasSufficientDestinationCard() {
        if (!hasDestination()) {
            return false;
        }
        boolean hasDataViaReference = getDestinationOfFunds().hasReference() && getDestinationOfFunds().getCardRefId() != null;
        boolean hasDataViaFullCardData = getDestinationOfFunds().hasCard()
                && getDestinationOfFunds().getCard().getNumber() != null
                && !getDestinationOfFunds().getCard().getNumber().trim().isEmpty();
        return hasDataViaReference || hasDataViaFullCardData;
    }
}
