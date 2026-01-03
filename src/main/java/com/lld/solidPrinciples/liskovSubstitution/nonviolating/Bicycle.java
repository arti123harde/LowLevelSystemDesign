package com.lld.solidPrinciples.liskovSubstitution.nonviolating;

/**
 * @author Arti Harde
 */
public class Bicycle extends Bike{

    String brand;
    boolean hasGears;
    int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }
}
