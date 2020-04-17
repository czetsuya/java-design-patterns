package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class SqlQueryBuilder extends AbstractQueryBuilder {

    @Override
    void buildQuery() {
        query.setSql("sql");
    }

}
