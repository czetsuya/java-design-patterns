package com.czetsuya.designpatterns.behavioral.command;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class MessageHolder {

    private String text = "Initial Text";

    private Queue<Command> commands = new LinkedList<>();

    public void executeCommand(Command command) {
        command.action();
        commands.add(command);
    }

    public void undo() {
        Command cmd = commands.poll();
        if (cmd != null) {
            cmd.undo();
        }
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
