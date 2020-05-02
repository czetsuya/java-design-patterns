package com.czetsuya.designpatterns.structural.bridge;

import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Setter
public class ScriptInstance extends JdkCompiler {

    public void execute() {
        compile();
    }
}
