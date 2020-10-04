package com.czetsuya.designpatterns.structural.proxy;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class ImageProxy extends Image {

    private Image image;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void render() {
        if (image == null) {
            image = new Image(this.url);
        }

        image.render();
    }
}
