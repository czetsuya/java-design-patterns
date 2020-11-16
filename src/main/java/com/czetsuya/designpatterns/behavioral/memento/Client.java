package com.czetsuya.designpatterns.behavioral.memento;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        ScriptInstance si = new ScriptInstance();
        si.setCode("HelloWorld");
        si.setScript("printf 'hello'");

        si.execute();

        ScriptInstanceCareTaker careTaker = new ScriptInstanceCareTaker();
        careTaker.saveState(si);

        ScriptInstance si2 = new ScriptInstance();
        careTaker.restoreState(si2);

        si2.execute();
    }

}
