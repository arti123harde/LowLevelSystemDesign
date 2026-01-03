package com.study.solidPrinciples.interfaceSegmented.nonviolating;

import com.study.solidPrinciples.interfaceSegmented.violating.RestaurantEmployee;

/**
 * @author Arti Harde
 */
public class Chef implements ChefTasks {

    @Override
    public void prepareFood() {
        System.out.println("Preparing the food...");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding the menu...");
    }

}
