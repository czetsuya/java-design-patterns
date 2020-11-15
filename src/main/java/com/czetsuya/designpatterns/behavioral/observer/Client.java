package com.czetsuya.designpatterns.behavioral.observer;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        EmailNotification em = new EmailNotification();
        PersistenceService ps = new PersistenceService();
        ps.attachObserver(new ScriptNotification());
        ps.attachObserver(em);

        ps.persist("User [id=1, name='edward']");

        System.out.println("detaching emailNotif");

        ps.detachObserver(em);
        ps.persist("User [id=2, name='kerri']");
    }

}
