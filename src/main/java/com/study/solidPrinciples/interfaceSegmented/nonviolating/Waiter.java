package com.study.solidPrinciples.interfaceSegmented.nonviolating;

import com.study.solidPrinciples.interfaceSegmented.violating.RestaurantEmployee;

/**
 * @author Arti Harde
 */
public class Waiter implements WaiterTasks {

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks...");
    }

    @Override
    public void takeOrder() {
        System.out.println("Taking order...");
    }
}
