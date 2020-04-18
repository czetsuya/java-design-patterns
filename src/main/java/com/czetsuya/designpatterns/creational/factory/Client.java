package com.czetsuya.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String args[]) {
        AbstractSqlConnectionFactory factory = new PostgreSqlConnectionFactory();
        System.out.println(factory.createConnection());

        factory = new Neo4jSqlConnectionFactory();
        System.out.println(factory.createConnection());
    }
}
