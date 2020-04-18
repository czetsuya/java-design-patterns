package com.czetsuya.designpatterns.creational.factory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Neo4jSqlConnectionFactory extends AbstractSqlConnectionFactory {

    @Override
    public SqlConnection createConnection() {
        return new Neo4jSqlConnection();
    }

}
