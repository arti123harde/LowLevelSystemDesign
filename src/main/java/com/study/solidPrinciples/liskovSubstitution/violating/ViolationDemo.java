package com.study.solidPrinciples.liskovSubstitution.violating;

/**
 * @author Arti Harde
 */
public class ViolationDemo {

    public static void main(String[] args) {
        //Violating LSP
        System.out.println("------------------ Violating LSP Demo ------------------");
        MotorCycle motorCycle = new MotorCycle("Royal Enfield", 40);
        motorCycle.turnOffEngine();
        motorCycle.turnOnEngine();
        motorCycle.applyBrakes();
        motorCycle.accelerate();

        Bicycle bicycle = new Bicycle("Hercules", 20);
        bicycle.applyBrakes();
        bicycle.accelerate();
        try {
            bicycle.turnOffEngine();
        }catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
        try {
            bicycle.turnOnEngine();
        }catch (AssertionError ex){
            System.out.println(ex.getClass() + " : " + ex.getLocalizedMessage());
        }
    }
}
