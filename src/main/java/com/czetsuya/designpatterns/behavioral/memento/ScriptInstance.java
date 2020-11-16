package com.czetsuya.designpatterns.behavioral.memento;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ScriptInstance {

    private String code;
    private String script;

    public ScriptInstanceState saveState() {
        return new ScriptInstanceState(code, script);
    }

    public void restoreState(ScriptInstanceState state) {
        code = state.getCode();
        script = state.getScript();
    }

    public void execute() {
        System.out.println(script);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }
}
