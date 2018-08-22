package com.payneteasy.dapi.acknowledge.cardref.request;

import com.payneteasy.dapi.acknowledge.general.InConsumer;

/**
 * Class is uses in card mapping notification requests for allow Consumer credentials
 * (phone, email, billing address, twitter name, etc) for mapping to card data.
 * PayneEasy sends HTTP request to Merchant's acknowledge server with this structure
 * as response on verification transaction complete.
 */
public class SendVerificationCardReferenceRequest {
    private InConsumer consumer;
    private ServerCardReference reference;
    private CardReferenceSession session;
    private CardNonSensitiveData sourceCard;

    public InConsumer getConsumer() {
        return consumer;
    }

    public void setConsumer(InConsumer consumer) {
        this.consumer = consumer;
    }

    public ServerCardReference getReference() {
        return reference;
    }

    public void setReference(ServerCardReference reference) {
        this.reference = reference;
    }

    public CardReferenceSession getSession() {
        return session;
    }

    public void setSession(CardReferenceSession session) {
        this.session = session;
    }

    public CardNonSensitiveData getSourceCard() {
        return sourceCard;
    }

    public void setSourceCard(CardNonSensitiveData sourceCard) {
        this.sourceCard = sourceCard;
    }
}
