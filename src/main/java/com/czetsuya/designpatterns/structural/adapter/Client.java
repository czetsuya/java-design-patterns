package com.czetsuya.designpatterns.structural.adapter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        
        LegacySqlConnectionBuilder legacySqlConnectionBuilder = new LegacySqlConnectionBuilder("jdbc.url://postgresql:5432/design-patterns", "kerri", "kerri", "design-patterns");
        System.out.println(legacySqlConnectionBuilder.buildConnection());

        SqlConnection conn = new SqlConnection("jdbc.url://postgresql:5432/design-patterns", "kerri", "kerri", "design-patterns", "public", "org.postgresql.driver");
        SqlConnectionBuilder sqlConnBuilder = new SqlConnectionBuilder(conn);
        System.out.println(sqlConnBuilder.buildConnection());
    }

}
