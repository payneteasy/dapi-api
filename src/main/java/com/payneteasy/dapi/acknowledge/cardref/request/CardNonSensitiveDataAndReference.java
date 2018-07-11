package com.payneteasy.dapi.acknowledge.cardref.request;

public class CardNonSensitiveDataAndReference {
    private Integer bin;
    private ServerCardReference reference;

    public CardNonSensitiveDataAndReference() {
    }

    public CardNonSensitiveDataAndReference(Integer bin,
            ServerCardReference reference) {
        this.bin = bin;
        this.reference = reference;
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }

    public ServerCardReference getReference() {
        return reference;
    }

    public void setReference(ServerCardReference reference) {
        this.reference = reference;
    }
}
