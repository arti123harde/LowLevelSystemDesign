package com.study.solidPrinciples.interfaceSegmented.violating;

/**
 * @author Arti Harde
 */
public class Waiter implements RestaurantEmployee {

    @Override
    public void prepareFood() {
        throw new AssertionError("Detail Message: Waiter cannot prepare the food!");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Detail Message: Waiter cannot decide the menu!");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Detail Message: Waiter cannot clean the kitchen!");
    }

    @Override
    public void reStockGroceries() {
        throw new AssertionError("Detail Message: Chef cannot reStock the Groceries!");
    }
}
