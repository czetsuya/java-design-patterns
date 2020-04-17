package com.czetsuya.designpatterns.creational.abstractfactory;

import com.czetsuya.designpatterns.creational.model.Account;
import com.czetsuya.designpatterns.creational.model.BillingAccount;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class BillingAccountFactory extends AbstractAccountFactory {

    @Override
    Account createAccount() {
        return new BillingAccount();
    }

}
