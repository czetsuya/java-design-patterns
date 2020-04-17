package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        QueryBuilder builder = new QueryBuilder();
        builder.setQueryBuilder(new SqlQueryBuilder());
        builder.buildQuery();
        System.out.println(builder.getQuery().getSql());

        builder = new QueryBuilder();
        builder.setQueryBuilder(new Neo4jQueryBuilder());
        builder.buildQuery();
        System.out.println(builder.getQuery().getSql());
    }

}
