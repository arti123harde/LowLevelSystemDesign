package com.study.designPatterns.behavioral.strategy.vehicleExample.problem;

/**
 * @author Arti Harde
 */
public class Vehicle {

    public void drive() {
        System.out.print("\n" + this.getClass().getSimpleName() + ": ");
        System.out.println("Driving Capability: Normal");
    }
}

