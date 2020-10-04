package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractSqlConnectionFactory {

    public static AbstractSqlConnectionFactory getFactory(SqlConnectionType type) {

        AbstractSqlConnectionFactory factory = null;
        switch (type) {
        case POSTGRES:
            factory = new PostgreSqlConnectionFactory();
            break;
        case NEO4J:
            factory = new Neo4jSqlConnectionFactory();
            break;
        }
        
        return factory;
    }

    public abstract AbstractSqlConnection createSqlConnection();
}
