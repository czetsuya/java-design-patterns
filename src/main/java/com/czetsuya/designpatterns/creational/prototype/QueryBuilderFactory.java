package com.czetsuya.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class QueryBuilderFactory {

    private static final Map<String, QueryBuilder> prototypes = new HashMap<>();

    static {
        prototypes.put("sql", new SqlQueryBuilder());
        prototypes.put("neo4j", new Neo4jQueryBuilder());
    }

    public static QueryBuilder getPrototype(String type) {
        return prototypes.get(type).clone();
    }
}
