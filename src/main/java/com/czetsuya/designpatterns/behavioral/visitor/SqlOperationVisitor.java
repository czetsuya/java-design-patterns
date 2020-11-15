package com.czetsuya.designpatterns.behavioral.visitor;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public interface SqlOperationVisitor {

    void visit(Datasource ds);
}
