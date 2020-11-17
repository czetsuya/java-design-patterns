package com.czetsuya.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class TabTwoDirector implements TabDirector {

    private LabelComponent label;

    @Override
    public void onSelect(String country) {
        if (label != null) {
            label.setText("Tab2: " + country);
        }
    }

    public LabelComponent getLabel() {
        return label;
    }

    public void setLabel(LabelComponent label) {
        this.label = label;
    }
}
