/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit.test;

import java.text.NumberFormat;
import java.util.HashMap;

/**
 *
 * @author phitran
 */
public class Cart {
   private HashMap<Item, Integer> items = new HashMap<Item, Integer>();
   private double total = 0;
   Orange orange = new Orange();
   Apple apple = new Apple();
    
   public Cart (String[] scannedItems){
       if (scannedItems == null || scannedItems.length == 0){
           System.out.println("No items");
       } else {
           for (int i = 0; i < scannedItems.length; i++){
               this.addItem(scannedItems[i]);
           }
       }
   }
   
   private Item checkString(String itemString){
       if (itemString.equals("Orange")){  
                   
                   return orange;
               } else if (itemString.equals("Apple")){
                   
                   return apple;
               } else {
                   System.out.println("Not a valid item");
        }
       return null;
   }
   
   public void addItem(String newItem){
       addItem(checkString(newItem));
   }
   
   public void addItem(Item newItem){
       if (items.containsKey(newItem)){
           items.put(newItem, items.get(newItem)+1);
           total = newItem.addPrice(total, items.get(newItem));
       } else {
           items.put(newItem, 1);
           total = newItem.addPrice(total, items.get(newItem));
       }
   }
   
   public double getTotal(){
       return total;
   }
   
   public void printTotal(){
    NumberFormat formattedTotal = NumberFormat.getCurrencyInstance();
    System.out.println(formattedTotal.format(total));
    }
}
