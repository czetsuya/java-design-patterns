package com.czetsuya.designpatterns.creational.prototype;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class SqlQueryBuilder implements QueryBuilder {

    @Override
    public QueryBuilder clone() {
        return new SqlQueryBuilder();
    }
}
