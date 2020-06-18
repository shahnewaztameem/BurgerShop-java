package com.java.burgershop;
// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.

public class Main {

    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic Hamburger", "Wheat", "Sausage", 3.56);
//        hamburger.additionalItem1("Tomato", 0.56);
//        System.out.println(hamburger.getCustomizedBurger());
//        hamburger.additionalItem2("Lettuce", 0.74);
//        System.out.println(hamburger.getCustomizedBurger());
//        hamburger.additionalItem3("Carrot", 0.4);
//        System.out.println(hamburger.getCustomizedBurger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Buffalo", 3.56);
//        System.out.println(healthyBurger.getBasePrice());
//        healthyBurger.additionalItem1("Tomato", 0.56);
//        System.out.println(healthyBurger.getCustomizedBurger());
//        healthyBurger.additionalItem2("Lettuce", 1.74);
//        System.out.println(healthyBurger.getCustomizedBurger());
//        System.out.println(healthyBurger.getBasePrice());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger();
        System.out.println(deluxeHamburger.getCustomizedBurger());


    }
}
