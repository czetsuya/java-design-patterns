package com.czetsuya.designpatterns.creational.abstractfactory;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class WebAccount extends Account {

    private String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
