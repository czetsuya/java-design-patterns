package com.czetsuya.designpatterns.creational.builder;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public abstract class IPhoneBuilder {

    protected IPhone iphone;

    public void createIPhone() {
        iphone = new IPhone();
    }
    
    public IPhone getIPhone() {
        return iphone;
    }
    
    abstract void setColor(String color);
    abstract void buildModel();
    abstract void setMemorySize(int memorySize);
}
