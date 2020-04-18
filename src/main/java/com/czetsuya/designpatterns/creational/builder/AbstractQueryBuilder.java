package com.czetsuya.designpatterns.creational.builder;

import java.util.Map;

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

    public void setParameters(Map<String, Object> parameters) {
        query.setParameters(parameters);
    }

    abstract void buildQuery();

    // we can add executeQuery here
}
