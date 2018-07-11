package com.payneteasy.dapi.acknowledge.general;

public class OutTransaction {
    private String currency;
    private long randomSumCentis;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public long getRandomSumCentis() {
        return randomSumCentis;
    }

    public void setRandomSumCentis(long randomSumCentis) {
        this.randomSumCentis = randomSumCentis;
    }
}
