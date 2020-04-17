package com.czetsuya.designpatterns.creational.builder2;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class IPhone5sBuilder extends IPhoneBuilder {

    @Override
    void setColor(String color) {
        iphone.setColor(color);
    }

    @Override
    void buildModel() {
        iphone.setModel("5S");
    }

    @Override
    void setMemorySize(int memorySize) {
        iphone.setMemorySize(memorySize);
    }

}
