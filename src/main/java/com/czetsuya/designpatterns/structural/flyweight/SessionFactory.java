package com.czetsuya.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class SessionFactory {

    private Map<String, Session> sessions = new HashMap<>();

    public Session createSession(SessionType dbType) {

        Session session = sessions.get(dbType.name());
        if (session == null) {
            session = AbstractSessionFactory.getFactory(dbType).createSession();
            sessions.put(dbType.name(), session);
        }

        return session;
    }

    public void printSessions() {
        for (Entry<String, Session> session : sessions.entrySet()) {
            System.out.println("Printing session with key=" + session.getKey() + " " + session.getValue());
        }
    }

}
