package com.czetsuya.designpatterns.creational.abstractfactory;

import java.util.Arrays;

import com.czetsuya.designpatterns.creational.model.AccountType;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        Arrays.asList(AccountType.values()).forEach(e -> System.out.println(AbstractAccountFactory.getFactory(e).createAccount()));
    }

}
