package com.czetsuya.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class EmailNotification implements Observer {

    @Override
    public void notify(String entity) {
        System.out.println("Sending email notification with entity " + entity);
    }

}
