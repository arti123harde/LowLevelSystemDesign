package com.lld.solidPrinciples.interfaceSegmented.violating;

/**
 * @author Arti Harde
 */
public class Maintenance implements RestaurantEmployee{

    @Override
    public void prepareFood() {
        throw new AssertionError("Detail Message: Maintenance cannot prepare the food!");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Detail Message: Maintenance cannot decide the menu!");
    }

    @Override
    public void serveFoodAndDrinks() {
        throw new AssertionError("Detail Message: Maintenance cannot serve food and drinks!");
    }

    @Override
    public void takeOrder() {
        throw new AssertionError("Detail Message: Maintenance cannot take orders!");
    }

    @Override
    public void cleanTheKitchen() {
        System.out.println("Cleaning the kitchen...");
    }

    @Override
    public void reStockGroceries() {
        System.out.println("Restocking Groceries...");
    }
}
