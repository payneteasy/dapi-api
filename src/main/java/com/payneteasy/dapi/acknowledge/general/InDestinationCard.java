package com.payneteasy.dapi.acknowledge.general;

public class InDestinationCard {
    private InCardReference reference;

    public InDestinationCard(InCardReference reference) {
        this.reference = reference;
    }

    public InDestinationCard() {
    }

    public InCardReference getReference() {
        return reference;
    }

    public void setReference(InCardReference reference) {
        this.reference = reference;
    }
}
