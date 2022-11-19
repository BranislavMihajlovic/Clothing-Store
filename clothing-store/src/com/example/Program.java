package com.example;

import com.example.processing.LoadProducts;
import com.example.products.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ArrayList<Products> products = new ArrayList<>();
        Scanner input = new Scanner(System.in);
                products.add(new Jackets("Black Cotton Suit Jacket", "BrandJ", 99.99, "Black", 50));
                products.add(new Shirts("Blue Cotton Shirt", "BrandS", 14.99, "Blue", "M"));
                products.add(new Shirts("White Cotton Shirt", "BrandS", 15.99, "White", "M"));
                products.add(new Shoes("Black Leather Shoes", "BrandS", 59.99, "Black", 43));
                products.add(new Trousers("Black Cotton Trousers", "BrandT", 29.99, "Black", 50));

        while (true) {
            System.out.print("""
                                       ---- Clothing Store ----
                    
                    -- Choose your products:
                    
                    """);
            for(int i=0; i< products.size(); i++){
                String type = "";
                String product_class = products.get(i).getClass().toString();

                if(product_class.contains("Shoes")) {
                    type = "Shoes:";
                }
                if(product_class.contains("Shirts")) {
                    type = "Shirt:";
                }
                if(product_class.contains("Trousers")) {
                    type = "Trouser:";
                }
                if(product_class.contains("Jackets")) {
                    type = "Jacket:";
                }
                System.out.println("["+(i+1)+"] "+type);
                System.out.println(products.get(i));
                if(i == products.size() - 1){
                    System.out.println("Insert 1 - 5 and press enter to add product to cart.");
                    System.out.println("If you are finished shopping, type PRINT.");
                }
            }
            LoadProducts.ProductsInCart();

            String izbor;
            izbor = input.nextLine();
            if(izbor.equals("1")) {
                LoadProducts.Load(products.get(0));
            } else if(izbor.equals("2")) {
                LoadProducts.Load(products.get(1));
            } else if(izbor.equals("3")) {
                LoadProducts.Load(products.get(2));
            } else if(izbor.equals("4")) {
                LoadProducts.Load(products.get(3));
            } else if(izbor.equals("5")) {
                LoadProducts.Load(products.get(4));
            } else if(izbor.toUpperCase().equals("PRINT")) {
                LoadProducts.sendToPrint();
                break;
            }
        }
    }
}