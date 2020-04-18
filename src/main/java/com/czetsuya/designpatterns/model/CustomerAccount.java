package com.czetsuya.designpatterns.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
public class CustomerAccount extends Account {

    private String currency;
    private String creditCategory;
    private Date statusDate;
}
