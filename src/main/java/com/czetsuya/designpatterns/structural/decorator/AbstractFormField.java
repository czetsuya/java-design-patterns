package com.czetsuya.designpatterns.structural.decorator;

import lombok.Setter;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
@Setter
public abstract class AbstractFormField implements FormField {

    private FormField formField;

    public String render() {
        return formField.render();
    }
}
