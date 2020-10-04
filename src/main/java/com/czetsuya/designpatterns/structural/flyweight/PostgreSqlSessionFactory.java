package com.czetsuya.designpatterns.structural.flyweight;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PostgreSqlSessionFactory extends AbstractSessionFactory {

    @Override
    public Session createSession() {
        return new PostgreSqlSession();
    }
}
