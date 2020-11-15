package com.czetsuya.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ScriptNotification implements Observer {

    @Override
    public void notify(String entity) {
        System.out.println("Running script with entity " + entity);
    }
}
