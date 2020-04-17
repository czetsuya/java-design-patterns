package com.czetsuya.designpatterns.creational.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
public class UserAccount extends Account {

    private Date subscriptionDate;
    private Date terminationDate;
}
