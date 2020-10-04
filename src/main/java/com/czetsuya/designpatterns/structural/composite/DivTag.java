package com.czetsuya.designpatterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class DivTag implements HtmlTag {

    private List<HtmlTag> htmlTags = new ArrayList<>();

    @Override
    public void render() {
        System.out.println("<div>");
        for (HtmlTag tag : htmlTags) {
            tag.render();
        }
        System.out.println("</div>");
    }

    public List<HtmlTag> getHtmlTags() {
        return htmlTags;
    }
}
