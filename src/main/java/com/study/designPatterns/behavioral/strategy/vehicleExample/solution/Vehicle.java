package com.study.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class Vehicle {

    DriverStrategy driverStrategy;

    public Vehicle(DriverStrategy driverStrategy) {
        this.driverStrategy = driverStrategy;
    }

    public void drive() {
        System.out.print(this.getClass().getSimpleName() + " = ");
        driverStrategy.drive();
    }
}
