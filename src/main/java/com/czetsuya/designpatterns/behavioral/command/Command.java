package com.czetsuya.designpatterns.behavioral.command;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public interface Command {

    abstract void action();

    abstract void undo();
}
