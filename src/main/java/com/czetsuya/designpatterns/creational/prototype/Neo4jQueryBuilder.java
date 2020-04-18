package com.czetsuya.designpatterns.creational.prototype;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Neo4jQueryBuilder implements QueryBuilder {

    @Override
    public QueryBuilder clone() {
        return new Neo4jQueryBuilder();
    }
}
