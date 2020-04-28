package com.czetsuya.designpatterns.behavioral.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class InventoryService {

    public void updateInventory(Product product) {
        System.out.println("update inventory " + product);
    }
}
