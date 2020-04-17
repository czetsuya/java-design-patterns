package com.czetsuya.designpatterns.creational.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
public class BillingAccount extends Account {

    private Date subscriptionDate;
    private Date nextInvoiceDate;
    private Date terminationDate;
    private String country;
    private String language;
}
