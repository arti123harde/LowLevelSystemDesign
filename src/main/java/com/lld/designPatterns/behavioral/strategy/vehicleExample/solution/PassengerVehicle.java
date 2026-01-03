package com.lld.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class PassengerVehicle extends Vehicle{

    public PassengerVehicle(DriverStrategy driverStrategy) {
        super(driverStrategy);
    }
}
