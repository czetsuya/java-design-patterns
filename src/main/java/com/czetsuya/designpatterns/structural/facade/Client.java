package com.czetsuya.designpatterns.structural.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        OrderingSystem orderingSystem = new OrderingSystem();
        orderingSystem.placeOrder(new Product());
    }

}
