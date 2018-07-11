package com.payneteasy.dapi.acknowledge.general;

import com.payneteasy.dapi.acknowledge.general.card.SourceCard;

import javax.validation.Valid;

public class OutSourceCard {
    private SourceCard card;
    private OutCardReference reference;

    @Valid
    public SourceCard getCard() {
        return card;
    }

    public void setCard(SourceCard card) {
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
