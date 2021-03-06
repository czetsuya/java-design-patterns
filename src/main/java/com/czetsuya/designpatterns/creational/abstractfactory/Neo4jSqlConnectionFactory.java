package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Neo4jSqlConnectionFactory extends AbstractSqlConnectionFactory {

    @Override
    public AbstractSqlConnection createSqlConnection() {
        return new Neo4jSqlConnection();
    }

}
