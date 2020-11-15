package com.czetsuya.designpatterns.behavioral.command;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ClearMessageCommand extends AbstractCommand {

    private String prevMsg;

    public ClearMessageCommand(MessageHolder mh) {
        super(mh);
    }

    @Override
    public void action() {
        prevMsg = getMessageHolder().getText();
        getMessageHolder().setText("");
    }

    @Override
    public void undo() {
        getMessageHolder().setText(prevMsg);
    }

}
