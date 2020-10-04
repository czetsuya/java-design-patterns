package com.czetsuya.designpatterns.structural.proxy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Image {

    protected String url;

    public Image() {

    }

    public Image(String url) {
        this.url = url;
    }

    public void render() {
        System.out.println("<img src=" + url + "></img>");
    }
}
