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
    public Apple (){
        
    }
        public double addPrice(double total){
        return total += price;
    }
}
