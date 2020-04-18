package com.czetsuya.designpatterns.creational.builder;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("id", 1L);

        QueryBuilder builder = new QueryBuilder();
        builder.setQueryBuilder(new SqlQueryBuilder());
        builder.buildQuery(params);
        System.out.println(builder.getQuery().getSql());

        builder = new QueryBuilder();
        builder.setQueryBuilder(new Neo4jQueryBuilder());
        builder.buildQuery(params);
        System.out.println(builder.getQuery().getSql());
    }

}
