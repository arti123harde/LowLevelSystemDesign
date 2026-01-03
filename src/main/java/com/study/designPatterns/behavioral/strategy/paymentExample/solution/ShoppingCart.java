package com.study.designPatterns.behavioral.strategy.paymentExample.solution;

/**
 * @author Arti Harde
 * <p>
 *     Context class - holds reference to a strategy object
 * </p>
 */
public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void checkout(double amount) {
        System.out.print(this.paymentStrategy.getClass().getSimpleName() + ": ");
        paymentStrategy.pay(amount);
    }

}
