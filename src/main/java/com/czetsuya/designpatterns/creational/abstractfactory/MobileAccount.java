package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class MobileAccount extends Account {

    private String mobileNo;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
