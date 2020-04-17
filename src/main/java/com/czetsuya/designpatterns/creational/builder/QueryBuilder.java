package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class QueryBuilder {

    private AbstractQueryBuilder builder;

    public void setQueryBuilder(AbstractQueryBuilder builder) {
        this.builder = builder;
    }

    public Query getQuery() {
        return builder.getQuery();
    }

    public void buildQuery() {
        builder.createQuery();
        builder.buildQuery();
    }

}
