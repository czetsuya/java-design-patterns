package com.czetsuya.designpatterns.structural.decorator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PickListField implements FormField {

    @Override
    public String render() {
        return "<dropdown id='input'></dropdown>";
    }

}
