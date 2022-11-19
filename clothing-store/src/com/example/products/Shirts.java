package com.example.products;

public class Shirts extends Products {

    private String size;

    public Shirts(){};
    public Shirts(String name, String brand, double price, String color, String size) {
        super(name, brand, price, color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() + String.format("""
                    Size: %s
                """, size);
    }
}