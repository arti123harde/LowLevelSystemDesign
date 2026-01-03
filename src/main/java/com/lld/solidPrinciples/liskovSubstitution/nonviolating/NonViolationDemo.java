package com.lld.solidPrinciples.liskovSubstitution.nonviolating;

/**
 * @author Arti Harde
 */
public class NonViolationDemo {

    public static void main(String[] args) {
        //Non Violating LSP
        System.out.println("------------------ Non Violating LSP Demo ------------------");
        MotorCycle motorCycle = new MotorCycle("Royal Enfield", 40);
        motorCycle.turnOffEngine();
        motorCycle.turnOnEngine();
        motorCycle.applyBrakes();
        motorCycle.accelerate();

        Bicycle bicycle = new Bicycle("Hercules", 20);
        bicycle.applyBrakes();
        bicycle.accelerate();
    }
}
