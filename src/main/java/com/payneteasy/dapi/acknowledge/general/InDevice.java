package com.payneteasy.dapi.acknowledge.general;

public class InDevice {
    private String serialNumber;

    public InDevice(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public InDevice() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
