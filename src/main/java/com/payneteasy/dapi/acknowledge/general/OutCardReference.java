package com.payneteasy.dapi.acknowledge.general;

public class OutCardReference {

    /**
     * This ID uses in PaynetEasy for mapping card data source to ID in Merchant's system
     */
    private long serverCardId;

    public long getServerCardId() {
        return serverCardId;
    }

    public void setServerCardId(long serverCardId) {
        this.serverCardId = serverCardId;
    }
}
