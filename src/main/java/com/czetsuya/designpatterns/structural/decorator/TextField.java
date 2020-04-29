package com.czetsuya.designpatterns.structural.decorator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class TextField implements FormField {

    public String render() {
        return "<input id='input'></input>";
    }
}
