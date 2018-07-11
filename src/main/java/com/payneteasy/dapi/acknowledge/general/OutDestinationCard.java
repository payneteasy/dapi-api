package com.payneteasy.dapi.acknowledge.general;

import javax.validation.constraints.NotNull;

public class OutDestinationCard {
    private String number;

    @NotNull
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
