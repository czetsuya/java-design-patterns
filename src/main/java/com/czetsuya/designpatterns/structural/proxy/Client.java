package com.czetsuya.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {
        new Client();
    }

    public Client() {
        ImageProxy p1 = new ImageProxy("http://dummy1.png");
        ImageProxy p2 = new ImageProxy("http://dummy2.png");

        List<ImageProxy> images = new ArrayList<>();
        images.add(p1);
        images.add(p2);

        ImageRenderer imageRenderer = new ImageRenderer(images);

        imageRenderer.render();
    }

}
