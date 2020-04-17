package com.czetsuya.designpatterns.creational.singleton;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String args[]) {
        Preference.getInstance().getProperties().put("debug", false);

        ClientExtension ce = new ClientExtension();
        ce.printPreference();
    }
}
