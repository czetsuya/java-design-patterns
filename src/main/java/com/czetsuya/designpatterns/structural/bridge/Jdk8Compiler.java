package com.czetsuya.designpatterns.structural.bridge;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Jdk8Compiler extends AbstractJdkCompilerImpl {

    @Override
    void compile() {
        System.out.println("compiling with java 8");
    }

}
