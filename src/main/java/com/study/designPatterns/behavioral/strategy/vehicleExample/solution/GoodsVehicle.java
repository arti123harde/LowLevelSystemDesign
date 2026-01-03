package com.study.designPatterns.behavioral.strategy.vehicleExample.solution;

/**
 * @author Arti Harde
 */
public class GoodsVehicle extends Vehicle{

    public GoodsVehicle(DriverStrategy driverStrategy) {
        super(driverStrategy);
    }
}
