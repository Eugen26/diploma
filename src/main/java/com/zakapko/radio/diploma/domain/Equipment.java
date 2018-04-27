package com.zakapko.radio.diploma.domain;

import java.util.List;

public class Equipment {
    private int price;
    private String specialization;
    private List<Properties> properties;

    public Equipment(int price, String specialization, List<Properties> properties) {
        this.price = price;
        this.specialization = specialization;
        this.properties = properties;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }
}
