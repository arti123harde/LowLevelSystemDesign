package com.study.solidPrinciples.interfaceSegmented.nonviolating;

import com.study.solidPrinciples.interfaceSegmented.violating.RestaurantEmployee;

/**
 * @author Arti Harde
 */
public class Maintenance implements MaintenanceTasks {

    @Override
    public void cleanTheKitchen() {
        System.out.println("Cleaning the kitchen...");
    }

    @Override
    public void reStockGroceries() {
        System.out.println("Restocking Groceries...");
    }
}
