package com.czetsuya.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PersistenceService extends Observable {

    public void persist(String entity) {

        change(entity);
    }
}
