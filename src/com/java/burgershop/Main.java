package com.java.burgershop;
// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic Hamburger", "Wheat", "Sausage", 3.56);
//        hamburger.additionalItem1("Tomato", 0.56);
//        System.out.println(hamburger.getCustomizedBurger());
//        hamburger.additionalItem2("Lettuce", 0.74);
//        System.out.println(hamburger.getCustomizedBurger());
//        hamburger.additionalItem3("Carrot", 0.4);
//        System.out.println(hamburger.getCustomizedBurger());

        HealthyBurger hamburger = new HealthyBurger("Buffalo", 3.56);
        System.out.println(hamburger.getBasePrice());
        hamburger.additionalItem1("Tomato", 0.56);
        System.out.println(hamburger.getCustomizedBurger());
        hamburger.additionalItem2("Lettuce", 0.74);
        System.out.println(hamburger.getCustomizedBurger());



    }
}
