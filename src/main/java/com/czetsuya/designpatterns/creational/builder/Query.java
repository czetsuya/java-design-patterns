package com.czetsuya.designpatterns.creational.builder;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
public class Query {

    private String sql;
    private Map<String, Object> parameters;
}
