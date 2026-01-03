package com.study.solidPrinciples.liskovSubstitution.violating;

/**
 * @author Arti Harde
 */
public class Bicycle implements Bike {

    String brand;
    boolean hasGears;
    int speed;

    public Bicycle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("turnOnEngine failed : Bicycle has no engine!");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("turnOffEngine failed : Bicycle has no engine!");
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