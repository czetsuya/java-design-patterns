package com.czetsuya.designpatterns.structural.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class LegacySqlConnectionBuilder {

    private String url;
    private String username;
    private String password;
    private String database;
    
    public String buildConnection() {
        return toString();
    }
}
