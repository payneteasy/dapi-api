package com.payneteasy.dapi.acknowledge.check.response;

import com.payneteasy.dapi.acknowledge.general.OutConsumer;
import com.payneteasy.dapi.acknowledge.general.OutSourceCard;

import javax.validation.Valid;

/**
 * Class is uses for security purposes and allows PaynetEasy to compare the data sent by Merchant’s app
 * with the data stored on Merchant’s server through check-sale operations. Merchant's acknowledge server
 * should respond to PaynetEasy with current structure.
 */
public class CheckSaleResponse extends AbstractCheckResponse implements IHasSourceOfFunds {
    private OutConsumer consumer;
    private OutSourceCard sourceOfFunds;

    private CheckSaleResponse(){}

    public CheckSaleResponse(Throwable e, String orderId){
        super(e, orderId);
    }

    @Valid
    public OutConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(OutConsumer consumer) {
        this.consumer = consumer;
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

    public boolean hasSource() {
        return getSourceOfFunds() != null;
    }

    public Long getSourceCardRefId() {
        return hasSource() ? sourceOfFunds.getCardRefId() : null;
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
}
