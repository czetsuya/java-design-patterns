package com.czetsuya.designpatterns.structural.composite;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        PTag pTag = new PTag();
        SpanTag spantag = new SpanTag();
        DivTag divTag = new DivTag();
        divTag.getHtmlTags().add(pTag);
        divTag.getHtmlTags().add(spantag);
        divTag.render();
    }

}
