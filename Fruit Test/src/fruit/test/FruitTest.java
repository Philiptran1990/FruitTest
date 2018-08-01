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
public class FruitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] testArray = {"Orange", "Apple", "Orange", "Apple", "Orange", "Orange"};
        Cart testCart = new Cart(testArray);
        //System.out.println(testCart.getTotal());
        testCart.printTotal();
    }
    
}
