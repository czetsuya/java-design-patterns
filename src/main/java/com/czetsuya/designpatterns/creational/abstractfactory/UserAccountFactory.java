package com.czetsuya.designpatterns.creational.abstractfactory;

import com.czetsuya.designpatterns.creational.model.Account;
import com.czetsuya.designpatterns.creational.model.UserAccount;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class UserAccountFactory extends AbstractAccountFactory {

    @Override
    Account createAccount() {
        return new UserAccount();
    }

}
