package com.czetsuya.designpatterns.structural.proxy;

import java.util.List;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ImageRenderer {

    private List<ImageProxy> images;

    public ImageRenderer(List<ImageProxy> images) {
        this.images = images;
    }

    public void render() {
        for (ImageProxy image : images) {
            image.render();
        }
    }
}
