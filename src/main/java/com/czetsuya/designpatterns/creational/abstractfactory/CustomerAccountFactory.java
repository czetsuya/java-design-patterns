package com.czetsuya.designpatterns.creational.abstractfactory;

import com.czetsuya.designpatterns.creational.model.Account;
import com.czetsuya.designpatterns.creational.model.CustomerAccount;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class CustomerAccountFactory extends AbstractAccountFactory {

    @Override
    Account createAccount() {
        return new CustomerAccount();
    }

}
