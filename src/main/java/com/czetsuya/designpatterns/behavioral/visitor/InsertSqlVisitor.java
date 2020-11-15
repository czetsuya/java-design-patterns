package com.czetsuya.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class InsertSqlVisitor implements SqlOperationVisitor {

    public void visit(Datasource ds) {
        System.out.println("Insert on " + ds);
    }
}
