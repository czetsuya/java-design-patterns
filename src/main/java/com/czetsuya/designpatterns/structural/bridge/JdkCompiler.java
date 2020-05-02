package com.czetsuya.designpatterns.structural.bridge;

import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Setter
public class JdkCompiler {

    private AbstractJdkCompilerImpl jdkCompilerImpl;

    public void compile() {
        jdkCompilerImpl.compile();
    }
}
