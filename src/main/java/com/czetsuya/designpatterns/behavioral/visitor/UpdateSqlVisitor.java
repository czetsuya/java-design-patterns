package com.czetsuya.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class UpdateSqlVisitor implements SqlOperationVisitor {

    public void visit(Datasource ds) {
        System.out.println("Update on " + ds);
    }
}
