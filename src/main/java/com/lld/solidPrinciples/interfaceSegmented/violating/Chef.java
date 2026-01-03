package com.lld.solidPrinciples.interfaceSegmented.violating;

/**
 * @author Arti Harde
 */
public class Chef implements RestaurantEmployee {

    @Override
    public void prepareFood() {
        System.out.println("Preparing the food...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding the menu...");
    }

    @Override
    public void serveFoodAndDrinks() {
        throw new AssertionError("Detail Message: Chef cannot serve food and drinks!");
    }

    @Override
    public void takeOrder() {
        throw new AssertionError("Detail Message: Chef cannot take orders!");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Detail Message: Chef cannot clean the kitchen!");
    }

    @Override
    public void reStockGroceries() {
        throw new AssertionError("Detail Message: Chef cannot reStock the Groceries!");
    }
}
