package com.lld.solidPrinciples.interfaceSegmented.violating;


/**
 * @author Arti Harde
 * <p>
 *     All concrete class implementations are Bloated classes with empty or error-throwing methods
 * </p>
 */
public class ViolationDemo {

    public static void main(String[] args) {
        //Violating ISP

        System.out.println("--------------------- Waiter Responsibilities --------------------- ");
        Waiter waiter = new Waiter();
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();
        try {
            waiter.prepareFood();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            waiter.decideMenu();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            waiter.cleanTheKitchen();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            waiter.reStockGroceries();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }

        System.out.println("--------------------- Chef Responsibilities --------------------- ");
        Chef chef = new Chef();
        chef.prepareFood();
        chef.decideMenu();
        try {
            chef.cleanTheKitchen();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            chef.reStockGroceries();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            chef.takeOrder();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            chef.serveFoodAndDrinks();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }

        System.out.println("--------------------- Maintenance Responsibilities --------------------- ");
        Maintenance maintenance = new Maintenance();
        maintenance.cleanTheKitchen();
        maintenance.reStockGroceries();
        try {
            maintenance.prepareFood();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            maintenance.decideMenu();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            maintenance.takeOrder();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            maintenance.serveFoodAndDrinks();
        } catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
    }
}
