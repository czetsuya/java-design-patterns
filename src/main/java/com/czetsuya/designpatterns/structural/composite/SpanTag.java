package com.czetsuya.designpatterns.structural.composite;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class SpanTag implements HtmlTag {

    @Override
    public void render() {
        System.out.println("<span></span>");
    }

}
