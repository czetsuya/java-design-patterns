package com.czetsuya.designpatterns.structural.decorator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class DecorateFormField extends AbstractFormField {

    @Override
    public String render() {

        return String.format("<label for='input'>%s</label>", super.render());
    }

}
