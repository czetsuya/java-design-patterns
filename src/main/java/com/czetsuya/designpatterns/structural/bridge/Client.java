package com.czetsuya.designpatterns.structural.bridge;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String args[]) {

        ScriptInstance si = new ScriptInstance();
        si.setJdkCompilerImpl(new Jdk8Compiler());
        si.execute();

        si.setJdkCompilerImpl(new Jdk9Compiler());
        si.execute();
    }
}
