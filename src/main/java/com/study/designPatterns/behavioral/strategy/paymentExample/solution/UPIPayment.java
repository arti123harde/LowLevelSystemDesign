package com.study.designPatterns.behavioral.strategy.paymentExample.solution;

/**
 * @author Arti Harde
 * <p>
 *     Concrete strategy - for UPI payment
 * </p>
 */
public class UPIPayment implements PaymentStrategy {

    private final String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI ID " + upiId);
    }
}


