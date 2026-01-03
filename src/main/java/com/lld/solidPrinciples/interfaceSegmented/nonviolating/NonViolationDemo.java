package com.lld.solidPrinciples.interfaceSegmented.nonviolating;


/**
 * @author Arti Harde
 * <p>
 *     GOOD: This follows ISP - Multiple focused interfaces following ISP </br>
 *     Now classes only implement what they actually need - Clean implementations
 * </p>
 */
public class NonViolationDemo {

    public static void main(String[] args) {
        //Non Violating ISP

        System.out.println("--------------------- Waiter Responsibilities --------------------- ");
        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();

        System.out.println("--------------------- Chef Responsibilities --------------------- ");
        Chef chef = new Chef();
        chef.prepareFood();
        chef.decideMenu();

        System.out.println("--------------------- Maintenance Responsibilities --------------------- ");
        Maintenance maintenance = new Maintenance();
        maintenance.cleanTheKitchen();
        maintenance.reStockGroceries();
    }
}
