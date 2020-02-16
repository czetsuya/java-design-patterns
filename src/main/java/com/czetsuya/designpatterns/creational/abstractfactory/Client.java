package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(AbstractFactory.getFactory(AccountType.MOBILE).createAccount().getClass());
        System.out.println(AbstractFactory.getFactory(AccountType.WEB).createAccount().getClass());
    }
}
