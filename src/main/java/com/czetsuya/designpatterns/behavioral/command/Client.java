package com.czetsuya.designpatterns.behavioral.command;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        MessageHolder mh = new MessageHolder();
        AddMessageCommand add = new AddMessageCommand(mh, "Hello World!");
        mh.executeCommand(add);
        System.out.println("add => " + mh.getText());
        mh.undo();
        System.out.println("undo => " + mh.getText());
        ClearMessageCommand clear = new ClearMessageCommand(mh);
        mh.executeCommand(clear);
        System.out.println("clear => " + mh.getText());
        mh.undo();
        System.out.println("undo => " + mh.getText());
    }

}
