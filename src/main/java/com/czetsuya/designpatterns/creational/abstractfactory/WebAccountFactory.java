package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class WebAccountFactory extends AbstractFactory {

    @Override
    public Account createAccount() {
        return new WebAccount();
    }

}
