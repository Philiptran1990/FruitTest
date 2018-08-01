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
public class Item {

    double price;

    public Item() {

    }

    public double addPrice(double total, int quantity) {
        return total += price;
    }
}
