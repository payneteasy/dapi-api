package com.payneteasy.dapi.acknowledge.general.card;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;

public class Expiry {
    private int month;
    private int year;

    @NotNull
    @Min(1)
    @Max(12)
    @XmlElement(required = true)
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    @NotNull
    @Min(2000)
    @Max(9999)
    @XmlElement(required = true)
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonthAs2Digits() {
        return String.format("%02d", month);
    }
}
