package com.lld.solidPrinciples.interfaceSegmented.nonviolating;

/**
 * @author Arti Harde
 * <p>
 *     BAD: This class violates ISP. </br>
 *     This is a fat interface.  </br>
 *     One large interface forcing all implementers to define unused methods  </br>
 * </p>
 */
public interface ChefTasks {

    void prepareFood();
    void decideMenu();

}
