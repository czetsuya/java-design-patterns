package com.czetsuya.designpatterns.behavioral.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class OrderService {

    public Order createOrder(Product product) {
        System.out.println("place order " + product);
        return new Order();
    }
}
