package com.example.receipt;

import com.example.products.Products;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

public class Cashier {
    public static void print (ArrayList<Products> print_product) {
        if(print_product.size() == 0) {
            System.err.println("There is no products in the cart!");
        } else {
            double subtotal = 0;
            double total = 0;
            double discount = 0;
            int discount_persentige = 0;

            LocalDateTime now = LocalDateTime.now(ZoneId.of("Europe/Belgrade"));
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.printf("Date: %s\n", now.format(dtf));
            System.out.println("    ---Products---");
            System.out.println("");
            for(int i = 0; i < print_product.size(); i = i + 1) {
                subtotal += print_product.get(i).getPrice();
                double item_discount = 0;
                if(print_product.size() >= 3){
                    item_discount = print_product.get(i).getPrice() * 0.2;
                    discount_persentige = 20;
                }
                Calendar c1 = Calendar.getInstance();
                int day = c1.get(Calendar.DAY_OF_WEEK);
                if(day == 3) {
                    double thu_discount = 0;
                        if(print_product.get(i).getClass().toString().contains("Shirts")) {
                            thu_discount = print_product.get(i).getPrice() * 0.1;
                            if(thu_discount > item_discount){
                                item_discount = thu_discount;
                                discount_persentige=10;
                            }
                        }
                        if(print_product.get(i).getClass().toString().contains("Shoes")) {
                            thu_discount = print_product.get(i).getPrice() * 0.25;
                            System.out.println("thu disc"+thu_discount);
                            if(thu_discount > item_discount){
                                item_discount = thu_discount;
                                discount_persentige = 25;
                            }
                        }
                    }
                discount += item_discount;

                System.out.printf("""
                        %s
                        $%.2f
                        #discount %d%% -$%.2f
                        \n""", print_product.get(i).getName(), print_product.get(i).getPrice(), discount_persentige, item_discount);
            }
            System.out.println("--------------------------");
            System.out.printf("""
                    SUBTOTAL: $%.2f
                    DISCOUNT: -$%.2f
                    TOTAL: $%.2f
                    """, subtotal, discount, subtotal-discount );
        }
    }
}