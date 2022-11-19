package com.example.products;

public class Products {
    protected String name;
    protected String brand;
    protected double price;
    protected String color;

    public Products(){};
    public Products(String name, String brand, double price, String color) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String toString() {
        return String.format("""
                    Name: %s
                    Brand: %s
                    Price: $%.2f
                    Color: %s
                """, name, brand, price, color);
    }
}