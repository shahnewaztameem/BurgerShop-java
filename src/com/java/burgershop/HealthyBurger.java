package com.java.burgershop;

// Also create two extra varieties of Hamburgers (subclasses) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
public class HealthyBurger extends Hamburger {
    private String additionalHealthyItem1;
    private String additionalHealthyItem2;

    private double additionalHealthyItemPrice1;
    private double additionalHealthyItemPrice2;

    public HealthyBurger(String meat, double basePrice) {
        super("Healthy Burger", "Brown rye bread roll", meat, basePrice);

    }

    @Override
    public void additionalItem1(String name, double price) {
        super.additionalItem1(name, price);
    }

    @Override
    public void additionalItem2(String name, double price) {
        super.additionalItem2(name, price);
    }

    @Override
    public String getCustomizedBurger() {
        return super.getCustomizedBurger();
    }

    public String getAdditionalHealthyItem1() {
        return additionalHealthyItem1;
    }

    public String getAdditionalHealthyItem2() {
        return additionalHealthyItem2;
    }

    public double getAdditionalHealthyItemPrice1() {
        return additionalHealthyItemPrice1;
    }

    public double getAdditionalHealthyItemPrice2() {
        return additionalHealthyItemPrice2;
    }
}
