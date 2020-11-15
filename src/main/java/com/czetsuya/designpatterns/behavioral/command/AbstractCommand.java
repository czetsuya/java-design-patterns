package com.czetsuya.designpatterns.behavioral.command;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractCommand implements Command {

    private MessageHolder messageHolder;

    public AbstractCommand(MessageHolder messageHolder) {
        this.messageHolder = messageHolder;
    }

    public MessageHolder getMessageHolder() {
        return messageHolder;
    }

}
