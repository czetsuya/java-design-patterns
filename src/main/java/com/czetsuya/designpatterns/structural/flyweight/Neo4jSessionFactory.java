package com.czetsuya.designpatterns.structural.flyweight;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Neo4jSessionFactory extends AbstractSessionFactory {

    @Override
    Session createSession() {
        return new Neo4jSession();
    }
}
