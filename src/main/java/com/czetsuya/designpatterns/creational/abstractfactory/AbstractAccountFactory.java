package com.czetsuya.designpatterns.creational.abstractfactory;

import com.czetsuya.designpatterns.creational.model.Account;
import com.czetsuya.designpatterns.creational.model.AccountType;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractAccountFactory {

    public static AbstractAccountFactory getFactory(AccountType type) {

        AbstractAccountFactory factory = null;
        switch (type) {
        case CA:
            factory = new CustomerAccountFactory();
            break;
        case BA:
            factory = new BillingAccountFactory();
            break;
        case UA:
            factory = new UserAccountFactory();
            break;
        }

        return factory;
    }

    abstract Account createAccount();
}
