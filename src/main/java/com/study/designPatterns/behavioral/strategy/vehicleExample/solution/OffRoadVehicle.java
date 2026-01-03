package com.study.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class OffRoadVehicle extends Vehicle{

    public OffRoadVehicle(DriverStrategy driverStrategy) {
        super(driverStrategy);
    }
}
