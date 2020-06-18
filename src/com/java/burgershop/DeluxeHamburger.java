package com.java.burgershop;
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.


public class DeluxeHamburger extends Hamburger {
    public DeluxeHamburger() {
        super("Deluxe Hamburger", "White", "Sausage & Becon", 7.00);
        super.additionalItem1("Chips", 2.00);
        super.additionalItem2("Seven-Up", 1.00);
    }

    @Override
    public void additionalItem1(String name, double price) {
        System.out.println("No additional Items can be added in this package");
    }

    @Override
    public void additionalItem2(String name, double price) {
        System.out.println("No additional Items can be added in this package");
    }

    @Override
    public void additionalItem3(String name, double price) {
        System.out.println("No additional Items can be added in this package");
    }

    @Override
    public void additionalItem4(String name, double price) {
        System.out.println("No additional Items can be added in this package");
    }
}
