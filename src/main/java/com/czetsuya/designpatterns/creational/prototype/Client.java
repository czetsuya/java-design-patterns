package com.czetsuya.designpatterns.creational.prototype;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String args[]) {
        
        System.out.println(QueryBuilderFactory.getPrototype("sql"));
        System.out.println(QueryBuilderFactory.getPrototype("neo4j"));
    }
}
