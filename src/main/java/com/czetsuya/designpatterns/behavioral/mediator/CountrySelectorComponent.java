package com.czetsuya.designpatterns.behavioral.mediator;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class CountrySelectorComponent {

    private TabOneDirector tabOne;
    private TabTwoDirector tabTwo;

    public void onSelect(String country) {

        System.out.println("Country selected --> " + country);

        if (tabOne != null) {
            tabOne.onSelect(country);
        }

        if (tabTwo != null) {
            tabTwo.onSelect(country);
        }
    }

    public void setTabOne(TabOneDirector tabOne) {
        this.tabOne = tabOne;
    }

    public void setTabTwo(TabTwoDirector tabTwo) {
        this.tabTwo = tabTwo;
    }
}
