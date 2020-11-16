package com.czetsuya.designpatterns.behavioral.memento;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ScriptInstanceState {

    private String code;
    private String script;

    public ScriptInstanceState(String code, String script) {
        this.code = code;
        this.script = script;
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
