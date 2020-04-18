package com.czetsuya.designpatterns.creational.abstractfactory;

import java.util.Arrays;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Arrays.asList(SqlConnectionType.values()).forEach(e -> System.out.println(AbstractSqlConnectionFactory.getFactory(e).createSqlConnection()));
    }

}
