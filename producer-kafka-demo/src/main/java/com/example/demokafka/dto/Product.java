package com.example.demokafka.dto;

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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
