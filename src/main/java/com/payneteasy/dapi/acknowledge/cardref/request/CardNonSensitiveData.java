package com.payneteasy.dapi.acknowledge.cardref.request;

public class CardNonSensitiveData {

    /**
     * Bank Identification Number
     */
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
