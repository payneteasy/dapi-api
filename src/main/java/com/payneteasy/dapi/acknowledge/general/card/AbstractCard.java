package com.payneteasy.dapi.acknowledge.general.card;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

public abstract class AbstractCard {
    private String number;

    @NotNull
    @Size(min = 9, max = 19)
    @Digits(integer = 19, fraction = 0)
    @XmlElement(required = true)
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
