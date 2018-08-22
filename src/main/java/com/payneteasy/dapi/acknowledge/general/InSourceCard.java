package com.payneteasy.dapi.acknowledge.general;

public class InSourceCard {

    private InCardReference reference;

    public InSourceCard(InCardReference inCardReference){
        this.reference = inCardReference;
    }

    public InSourceCard() {
    }

    public InCardReference getReference() {
        return reference;
    }

    public void setReference(InCardReference reference) {
        this.reference = reference;
    }
}
