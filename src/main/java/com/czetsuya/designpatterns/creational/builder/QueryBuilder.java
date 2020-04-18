package com.czetsuya.designpatterns.creational.builder;

import java.util.Map;

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

    public void buildQuery(Map<String, Object> parameters) {
        builder.createQuery();
        builder.setParameters(parameters);
        builder.buildQuery();
    }

}
