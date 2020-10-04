package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PostgreSqlConnectionFactory extends AbstractSqlConnectionFactory {

    @Override
    public AbstractSqlConnection createSqlConnection() {
        return new PostgreSqlConnection();
    }

}
