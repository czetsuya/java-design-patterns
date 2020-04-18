package com.czetsuya.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PostgreSqlConnectionFactory extends AbstractSqlConnectionFactory {

    @Override
    public SqlConnection createConnection() {
        return new PostgreSqlConnection();
    }

}
