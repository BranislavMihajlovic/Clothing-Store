package com.example.products;

public class Shoes extends Products {

    private int size;

    public Shoes(String name, String brand, double price, String color, int size){
        super(name, brand, price, color);
        this.size = size;
    };

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String toString() {
        return super.toString() + String.format("""
                    Size: %d
                """, size);
    }
}