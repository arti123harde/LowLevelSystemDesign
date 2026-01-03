package com.lld.solidPrinciples.interfaceSegmented.nonviolating;

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
