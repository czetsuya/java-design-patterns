package com.czetsuya.designpatterns.structural.facade;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class OrderingSystem {

    private OrderService orderService = new OrderService();
    private InventoryService inventoryService = new InventoryService();
    private ShippingService shippingService = new ShippingService();
    
    public void placeOrder(Product product) {
        
        Order order = orderService.createOrder(product);
        inventoryService.updateInventory(product);
        shippingService.scheduleShipment(order);
    }
}
