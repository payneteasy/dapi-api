package com.payneteasy.dapi.acknowledge.general.card;

public abstract class Name {
    private String firstName;
    private String lastName;
    private String middleInitial;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getFullName() {
        if (!hasText(firstName)) {
            return lastName;
        }
        if (!hasText(lastName)) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    private boolean hasText(String s) {
        return s != null && s.trim().length() > 0;
    }
}
