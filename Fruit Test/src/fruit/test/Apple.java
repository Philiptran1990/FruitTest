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
public class Apple extends Item{
    private double price = 0.60;
    private boolean specialOffer;

    public boolean isSpecialOffer() {
        return specialOffer;
    }

    public void setSpecialOffer(boolean specialOffer) {
        this.specialOffer = specialOffer;
    }
    
    public Apple (){
        
    }
        public double addPrice(double total, int quantity){
        if (quantity % 2 != 0){
            return total += price;
        }
        return total;
        
        
    }
        
}
