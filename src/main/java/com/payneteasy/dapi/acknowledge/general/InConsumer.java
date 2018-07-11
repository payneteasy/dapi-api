package com.payneteasy.dapi.acknowledge.general;

public class InConsumer {
    private InDevice device;

    public InConsumer(InDevice device) {
        this.device = device;
    }

    public InConsumer() {
    }

    public InDevice getDevice() {
        return device;
    }

    public void setDevice(InDevice device) {
        this.device = device;
    }
}
