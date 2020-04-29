package com.czetsuya.designpatterns.structural.decorator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        TextField tf = new TextField();
        System.out.println(tf.render());
        
        DecorateFormField dff = new DecorateFormField();
        dff.setFormField(tf);
        System.out.println(dff.render());
        
        dff.setFormField(new PickListField());
        System.out.println(dff.render());
    }

}
