package com.czetsuya.designpatterns.behavioral.memento;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ScriptInstanceCareTaker {

    private ScriptInstanceState scriptInstanceState;

    public void saveState(ScriptInstance si) {
        scriptInstanceState = si.saveState();
    }

    public void restoreState(ScriptInstance si) {
        si.restoreState(scriptInstanceState);
    }
}
