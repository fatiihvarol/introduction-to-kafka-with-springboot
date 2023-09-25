package com.example.consumerkafkademo.dto;

import lombok.Getter;

@Getter
public class Product {

    private int id;
    private String name;
    private String size;
    private boolean active;


    public Product(int id, String name, String size, boolean active) {
        this.id = id;
        this.name = name;
        this.size = size;
        this.active = active;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
