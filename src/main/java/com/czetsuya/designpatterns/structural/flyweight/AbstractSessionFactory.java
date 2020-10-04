package com.czetsuya.designpatterns.structural.flyweight;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractSessionFactory {

    public static AbstractSessionFactory getFactory(SessionType type) {

        AbstractSessionFactory factory = null;
        switch (type) {
        case POSTGRES:
            factory = new PostgreSqlSessionFactory();
            break;
        case NEO4J:
            factory = new Neo4jSessionFactory();
            break;
        }

        return factory;
    }

    abstract Session createSession();
}
