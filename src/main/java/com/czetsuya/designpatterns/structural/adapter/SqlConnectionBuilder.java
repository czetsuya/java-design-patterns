package com.czetsuya.designpatterns.structural.adapter;

import lombok.Getter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
public class SqlConnectionBuilder {

    private String sqlConnection;

    public SqlConnectionBuilder(SqlConnection conn) {

        LegacySqlConnectionBuilder legacySqlConnectionBuilder = new LegacySqlConnectionBuilder(conn.getUrl(), conn.getUsername(), conn.getPassword(), conn.getDatabase());

        sqlConnection = legacySqlConnectionBuilder.buildConnection() + String.format(", schema=%s, driver=%s", conn.getSchema(), conn.getDriver());
    }
    
    public String buildConnection() {
        return sqlConnection;
    }
}
