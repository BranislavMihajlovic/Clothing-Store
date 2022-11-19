package com.example.processing;

import com.example.receipt.Cashier;
import com.example.products.Products;
import java.util.ArrayList;

public class LoadProducts {
    public static ArrayList<Products> ProductsForCart = new ArrayList<>();
    public static void Load (Products p) {
        ProductsForCart.add(p);
    }
    public static void sendToPrint() {
        Cashier.print(ProductsForCart);
    }

    public static void ProductsInCart () {
        System.out.println("Products in the Cart: ");
        for(int i = 0; i < ProductsForCart.size(); i++){
            System.out.printf("""
                        %s
                    """, ProductsForCart.get(i).getName());
        }
    }
}