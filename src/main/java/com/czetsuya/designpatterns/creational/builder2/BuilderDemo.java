package com.czetsuya.designpatterns.creational.builder2;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setIPhoneBuilder(new IPhoneXBuilder());
        manufacturer.buildIPhone("Gold", 64);
        System.out.println(manufacturer.getIPhone());
        
        manufacturer.setIPhoneBuilder(new IPhone5sBuilder());
        manufacturer.buildIPhone("Silver", 32);
        System.out.println(manufacturer.getIPhone());
    }
}
