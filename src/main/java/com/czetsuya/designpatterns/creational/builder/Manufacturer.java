package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Manufacturer {

    private IPhoneBuilder iPhoneBuilder;

    public void setIPhoneBuilder(IPhoneBuilder builder) {
        this.iPhoneBuilder = builder;
    }

    public IPhone getIPhone() {
        return iPhoneBuilder.getIPhone();
    }

    public void buildIPhone(String color, int memorySize) {
        iPhoneBuilder.createIPhone();
        iPhoneBuilder.buildModel();
        iPhoneBuilder.setColor(color);
        iPhoneBuilder.setMemorySize(memorySize);
    }

}
