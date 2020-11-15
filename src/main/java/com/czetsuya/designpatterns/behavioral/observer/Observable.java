package com.czetsuya.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class Observable {

    private List<Observer> observers = new ArrayList<>();

    public void attachObserver(Observer o) {
        observers.add(o);
    }

    public void detachObserver(Observer o) {
        observers.remove(o);
    }

    public void change(String entity) {
        for (Observer o : observers) {
            o.notify(entity);
        }
    }
}
