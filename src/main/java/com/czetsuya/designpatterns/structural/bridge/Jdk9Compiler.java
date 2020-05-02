package com.czetsuya.designpatterns.structural.bridge;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Jdk9Compiler extends AbstractJdkCompilerImpl {

    @Override
    void compile() {
        System.out.println("compiling with java 9");
    }

}
