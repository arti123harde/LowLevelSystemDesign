package com.study.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class HybridVehicle extends Vehicle{

    public HybridVehicle(DriverStrategy driverStrategy) {
        super(driverStrategy);
    }
}
