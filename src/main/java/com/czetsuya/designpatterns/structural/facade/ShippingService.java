package com.czetsuya.designpatterns.structural.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ShippingService {

    public void scheduleShipment(Order order) {
        System.out.println("schedule shipment " + order);
    }
}
