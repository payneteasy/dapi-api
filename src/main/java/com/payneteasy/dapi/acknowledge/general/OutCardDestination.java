package com.payneteasy.dapi.acknowledge.general;

import com.payneteasy.dapi.acknowledge.general.card.DestinationCard;

import javax.validation.Valid;

public class OutCardDestination {
    private DestinationCard card;
    private OutCardReference reference;

    @Valid
    public DestinationCard getCard() {
        return card;
    }

    public void setCard(DestinationCard card) {
        this.card = card;
    }

    public boolean hasCard() {
        return card != null;
    }

    @Valid
    public OutCardReference getReference() {
        return reference;
    }

    public void setReference(OutCardReference reference) {
        this.reference = reference;
    }

    public boolean hasReference() {
        return reference != null;
    }

    public Long getCardRefId() {
        return hasReference() ? reference.getServerCardId() : null;
    }

    public boolean hasOnlyCardRefIdOrFullCardData() {
        int count = 0;
        if (hasCard()) {
            count++;
        }
        if (hasReference()) {
            count++;
        }
        return count <= 1;
    }
}
