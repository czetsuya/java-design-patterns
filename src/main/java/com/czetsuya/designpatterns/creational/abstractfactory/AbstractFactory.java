package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class AbstractFactory {

    public static MobileAccountFactory mobileAccountFactory = new MobileAccountFactory();
    public static WebAccountFactory webAccountFactory = new WebAccountFactory();

    public static AbstractFactory getFactory(AccountType type) {

        AbstractFactory factory = null;
        switch (type) {
        case MOBILE:
            factory = mobileAccountFactory;
            break;
        case WEB:
            factory = webAccountFactory;
            break;
        }
        return factory;
    }

    abstract Account createAccount();
}
