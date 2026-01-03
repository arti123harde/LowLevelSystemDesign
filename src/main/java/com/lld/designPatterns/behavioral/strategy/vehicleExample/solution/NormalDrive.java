package com.lld.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class NormalDrive implements DriverStrategy{

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + ": DrivingStrategy is Normal");
    }
}
