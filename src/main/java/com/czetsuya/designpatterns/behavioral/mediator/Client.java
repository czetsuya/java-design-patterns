package com.czetsuya.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Client {

    public static void main(String[] args) {

        LabelComponent tab1Label = new LabelComponent();
        TabOneDirector tab1 = new TabOneDirector();
        tab1.setLabel(tab1Label);

        LabelComponent tab2Label = new LabelComponent();
        TabTwoDirector tab2 = new TabTwoDirector();
        tab2.setLabel(tab2Label);

        CountrySelectorComponent sel = new CountrySelectorComponent();
        sel.setTabOne(tab1);
        sel.setTabTwo(tab2);

        sel.onSelect("PH");

        System.out.println("Tab1 label=" + tab1Label.getText());
        System.out.println("Tab2 label=" + tab2Label.getText());
    }

}
