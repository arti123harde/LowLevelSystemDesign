package com.lld.designPatterns.behavioral.strategy.vehicleExample.solution;


/**
 * @author Arti Harde
 */
public class MainDriver {

    public static void main(String[] args) {
        System.out.println("Vehicle Drive Modes: Problem Demo");
        Vehicle vehicle;
        NormalDrive normalDrive = new NormalDrive();
        EDrive eDrive = new EDrive();
        SportDrive sportDrive = new SportDrive();

        // Sports vehicle - Sports drive mode
        vehicle = new SportsVehicle(sportDrive);
        vehicle.drive();

        // Off-road vehicle - Sports drive mode
        vehicle = new OffRoadVehicle(sportDrive);
        vehicle.drive();

        // Passenger vehicle - Normal drive mode
        vehicle = new PassengerVehicle(normalDrive);
        vehicle.drive();

        // Hybrid vehicle - Electric drive mode
        vehicle = new HybridVehicle(eDrive);
        vehicle.drive();

        // Goods vehicle - Normal drive mode
        vehicle = new GoodsVehicle(normalDrive);
        vehicle.drive();
    }
}
