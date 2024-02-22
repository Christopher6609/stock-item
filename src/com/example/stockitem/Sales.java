package com.example.stockitem;
import java.util.Scanner;
public class Sales {
    public static void main(String args[]){
        int eggsNeeded;
        boolean exit =false;
        Scanner reader = new Scanner(System.in);

        StockItem product2 = new StockItem("Eggs (box of 6", 175, 10);
        System.out.print("How many boxes of eggs do you want? ");
        do {
            if (reader.hasNextInt()) {
                eggsNeeded = reader.nextInt();
                product2.doSale(eggsNeeded);
                exit = true;

            } else {
                System.out.println("Please, Enter a valid quantity:");
            }
        }while (exit = !true);
                System.out.println(product2.toString());





    }

}
