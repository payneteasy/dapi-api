package com.payneteasy.dapi.acknowledge.cardref.request;

public class CardNonSensitiveData {
    private Integer bin;

    public CardNonSensitiveData(Integer bin) {
        this.bin = bin;
    }

    public CardNonSensitiveData() {
    }

    public Integer getBin() {
        return bin;
    }

    public void setBin(Integer bin) {
        this.bin = bin;
    }
}
