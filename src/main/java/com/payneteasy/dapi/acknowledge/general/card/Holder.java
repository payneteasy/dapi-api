package com.payneteasy.dapi.acknowledge.general.card;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;

public class Holder extends Name {
    @NotNull
    @Size(min = 1, max = 50)
    @XmlElement(required = true)
    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @NotNull
    @Size(min = 1, max = 50)
    @XmlElement(required = true)
    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Size(max = 1)
    @Override
    public String getMiddleInitial() {
        return super.getMiddleInitial();
    }
}
