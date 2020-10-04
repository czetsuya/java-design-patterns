package com.czetsuya.designpatterns.structural.composite;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class PTag implements HtmlTag {

    @Override
    public void render() {
        System.out.println("<p></p>");
    }

}
