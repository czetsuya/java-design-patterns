package com.czetsuya.designpatterns.behavioral.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ShippingService {

    public void scheduleShipment(Order order) {
        System.out.println("schedule shipment " + order);
    }
}
