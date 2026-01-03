package com.study.designPatterns.behavioral.strategy.paymentExample.solution;

/**
 * @author Arti Harde
 * <p>
 *     Concrete strategy - for PayPal payment
 * </p>
 */
public class PayPalPayment implements PaymentStrategy {

    private final String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal account " + email);
    }
}

