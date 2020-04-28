package com.czetsuya.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
@AllArgsConstructor
public class SqlConnection {

    private String url;
    private String username;
    private String password;
    private String database;
    private String schema;
    private String driver;
}
