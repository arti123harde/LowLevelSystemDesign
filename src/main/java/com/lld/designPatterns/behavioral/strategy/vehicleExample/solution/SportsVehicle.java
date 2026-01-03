package com.lld.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class SportsVehicle extends Vehicle {

    public SportsVehicle(DriverStrategy driverStrategy) {
        super(driverStrategy);
    }
}
