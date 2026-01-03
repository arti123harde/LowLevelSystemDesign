package com.study.solidPrinciples.interfaceSegmented.violating;

/**
 * @author Arti Harde
 * <p>
 *     BAD: This class violates ISP. </br>
 *     This is a fat interface.  </br>
 *     One large interface forcing all implementers to define unused methods  </br>
 * </p>
 */
public interface RestaurantEmployee {

    void prepareFood();
    void decideMenu();
    void serveFoodAndDrinks();
    void takeOrder();
    void cleanTheKitchen();
    void reStockGroceries();
}
