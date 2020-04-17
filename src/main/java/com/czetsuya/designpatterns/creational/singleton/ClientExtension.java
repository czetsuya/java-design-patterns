package com.czetsuya.designpatterns.creational.singleton;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ClientExtension {

    public void printPreference() {
        System.out.println("debug=" + Preference.getInstance().getProperties().get("debug"));
    }
}
