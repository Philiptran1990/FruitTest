/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit.test;

/**
 *
 * @author phitran
 */
public class Orange extends Item{
    private double price = 0.25;
    private boolean specialOffer = false;

    public boolean isSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }
    
    public Orange(){
        
    }
    
    public double addPrice(double total, int quantity){
        System.out.println(quantity % 3);
        if (quantity % 3 != 0){
            return total += price;
        }
        return total;
    }
        
}
