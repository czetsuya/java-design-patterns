package com.czetsuya.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractSqlConnectionFactory {

    abstract SqlConnection createConnection();
}
