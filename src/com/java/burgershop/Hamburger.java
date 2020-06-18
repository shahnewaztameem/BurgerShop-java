package com.java.burgershop;
// create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
public class Hamburger {
    private String name;
    private String breadRollType;
    private String meat;
    private double basePrice;
    private String additionalItemName1;
    private double additionalItemPrice1;
    private String additionalItemName2;
    private double additionalItemPrice2;
    private String additionalItemName3;
    private double additionalItemPrice3;
    private String additionalItemName4;
    private double additionalItemPrice4;

    public Hamburger() {
        this("Basic Hamburger", "default", "default", 3.56);
    }

    public Hamburger(String name, String breadRollType, String meat, double basePrice) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = meat;
        setBasePrice(basePrice);
    }

    public void setBasePrice(double basePrice) {
        if(basePrice < 0) {
            this.basePrice = 0;
        } else {
            this.basePrice = basePrice;
        }

    }

    public void additionalItem1(String name, double price) {
        this.additionalItemName1 = name;
        this.additionalItemPrice1 = price;
        System.out.println(this.additionalItemName1 + " has added for price " +this.additionalItemPrice1);
    }

    public void additionalItem2(String name, double price) {
        this.additionalItemName2 = name;
        this.additionalItemPrice2 = price;
        System.out.println(this.additionalItemName2 + " has added for price " +this.additionalItemPrice2);
    }

    public void additionalItem3(String name, double price) {
        this.additionalItemName3 = name;
        this.additionalItemPrice3 = price;
        System.out.println(this.additionalItemName3 + " has added for price " +this.additionalItemPrice3);
    }

    public void additionalItem4(String name, double price) {
        this.additionalItemName4 = name;
        this.additionalItemPrice4 = price;
        System.out.println(this.additionalItemName4 + " has added for price " +this.additionalItemPrice4);
    }

    public String getCustomizedBurger() {
        if(additionalItemName1 != null) {
            this.basePrice += additionalItemPrice1;
        } if(additionalItemName2 != null) {
            this.basePrice += additionalItemPrice2;
        } if(additionalItemName3 != null) {
            this.basePrice += additionalItemPrice3;
        } if(additionalItemName4 != null) {
            this.basePrice += additionalItemPrice4;
        }
        return "After adding additional item total price of the burger is " + this.basePrice;
    }

    public String getName() {
        return name;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getAdditionalItemName1() {
        return additionalItemName1;
    }

    public double getAdditionalItemPrice1() {
        return additionalItemPrice1;
    }

    public String getAdditionalItemName2() {
        return additionalItemName2;
    }

    public double getAdditionalItemPrice2() {
        return additionalItemPrice2;
    }

    public String getAdditionalItemName3() {
        return additionalItemName3;
    }

    public double getAdditionalItemPrice3() {
        return additionalItemPrice3;
    }

    public String getAdditionalItemName4() {
        return additionalItemName4;
    }

    public double getAdditionalItemPrice4() {
        return additionalItemPrice4;
    }
}
