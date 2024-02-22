

package com.example.stockitem;
import java.util.Date;
public class StockItem {
private String description;
private int level;
private double price;
private Date sellByDate;

public StockItem(String description, double price, int level){
    this.description = description;
    this.level = level;
    this.price = price;

}

public StockItem(Date date){
    sellByDate = date;
}


public String getDesc(){
return this.description;
}
public int getLevel(){
    return this.level;
}
public double getPrice(){
    return this.price;
}


//public void printReport(){
//    System.out.println("******* Stock Report ********");
//    System.out.println("*     Item:   "+ this.description);
//    System.out.println("*     Price: "+ this.price);
//    System.out.println("*     Stock Level: "+ this.level);
//    System.out.println("*****************************");
//
//}
    public void setPrice(double new_price){
        this.price = new_price;
    }

    public void doDelivery(int amount){
    level += amount;
    }
    public void doSale(int amount){
    if ((level - amount) > 0) {
        level -= amount;
    } else{
        level = 0;
    }
    }
public void setDescription(String newDescription){
    this.description = newDescription;
}

    public int getStockLevel(){
    return level;
    }
    public String getDescription(){
    return description;
    }
    public void setSellByDate(Date date){
    sellByDate= date;
    }




    public String toString(){
    return "******* Stock Report ********\n*     Item:   " + description +"\n*     Price: " + price + "\n*     Stock Level: "+ level +"\n   Sell by Date:   "+ sellByDate + "\n*****************************\n\n\n";
    }


}
