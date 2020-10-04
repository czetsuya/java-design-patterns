package com.czetsuya.designpatterns.structural.flyweight;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client() {

        SessionFactory sessionFactory = new SessionFactory();

        for (int i = 1; i < 5; i++) {
            sessionFactory.createSession(SessionType.POSTGRES);
        }

        for (int i = 1; i < 5; i++) {
            sessionFactory.createSession(SessionType.NEO4J);
        }

        sessionFactory.printSessions();
    }
}
