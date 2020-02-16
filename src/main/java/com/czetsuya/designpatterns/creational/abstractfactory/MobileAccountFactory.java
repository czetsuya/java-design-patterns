package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class MobileAccountFactory extends AbstractFactory {

    @Override
    public Account createAccount() {
        return new MobileAccount();
    }

}
