package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Neo4jQueryBuilder extends AbstractQueryBuilder {

    @Override
    void buildQuery() {
        query.setSql("neo4j  " + query.getParameters());
    }

}
