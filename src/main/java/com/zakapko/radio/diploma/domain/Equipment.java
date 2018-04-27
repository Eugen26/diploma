package com.zakapko.radio.diploma.domain;

import java.util.List;

public class Equipment {
    private int id;
    private int price;
    private int durability;
    private String name;
    private String type;
    private List<Properties> properties;

    public Equipment() {
    }

    public Equipment(int price, String type, List<Properties> properties) {
        this.price = price;
        this.type = type;
        this.properties = properties;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Properties> getProperties() {
        return properties;
    }

    public void setProperties(List<Properties> properties) {
        this.properties = properties;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }
}
