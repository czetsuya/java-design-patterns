package com.czetsuya.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Datasources ds = new Datasources();

        ds.getDatasources().add(new MongoDatasource());
        ds.getDatasources().add(new PostgresDatasource());
        ds.getDatasources().add(new Neo4jDatasource());

        ds.insert();

        ds.update();
    }

}
