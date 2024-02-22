package com.example.stockitem;

public class Tester {

    public static void main(String args[]){
        StockItem bob = new StockItem("Baked Beans 415g", 65, 10);

//        bob.printReport();
bob.setPrice(100);

        System.out.println(bob.toString());
        System.out.println("Done");

        StockItem chris = new StockItem("Spaghetti", 0.70, 5);
        chris.doDelivery(2);
        System.out.println(chris.toString());

        StockItem cola = new StockItem("Cola", 0.35, 6);
        cola.doSale(5);
        System.out.println(cola.toString());

    }

}
