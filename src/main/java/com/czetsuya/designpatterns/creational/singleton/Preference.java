package com.czetsuya.designpatterns.creational.singleton;

import java.util.Properties;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Getter
@Setter
public class Preference {

    private static Preference instance;
    private Properties properties = new Properties();

    public static synchronized void createInstance() {
        instance = new Preference();
    }

    public static Preference getInstance() {
        if (instance == null) {
            createInstance();
        }

        return instance;
    }
}
