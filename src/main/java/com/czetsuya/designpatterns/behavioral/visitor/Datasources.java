package com.czetsuya.designpatterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Datasources {

    private List<Datasource> dsList = new ArrayList<>();

    public List<Datasource> getDatasources() {
        return dsList;
    }

    public void insert() {
        SqlOperationVisitor visitor = new InsertSqlVisitor();
        for (Datasource ds : dsList) {
            visitor.visit(ds);
        }
    }

    public void update() {
        SqlOperationVisitor visitor = new UpdateSqlVisitor();
        for (Datasource ds : dsList) {
            visitor.visit(ds);
        }
    }
}
