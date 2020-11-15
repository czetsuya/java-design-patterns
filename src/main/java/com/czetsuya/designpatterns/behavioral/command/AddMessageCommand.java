package com.czetsuya.designpatterns.behavioral.command;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class AddMessageCommand extends AbstractCommand {

    private String msg;
    private String prevMsg;

    public AddMessageCommand(MessageHolder mh, String msg) {
        super(mh);
        this.msg = msg;
    }

    @Override
    public void action() {
        prevMsg = getMessageHolder().getText();
        getMessageHolder().setText(prevMsg + " : " + msg);
    }

    @Override
    public void undo() {
        getMessageHolder().setText(prevMsg);
    }

}
