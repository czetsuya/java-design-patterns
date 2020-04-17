package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractQueryBuilder {

    protected Query query;

    public void createQuery() {
        query = new Query();
    }

    public Query getQuery() {
        return query;
    }

    abstract void buildQuery();
}
