package com.study.designPatterns.behavioral.strategy.paymentExample.solution;

/**
 * @author Arti Harde
 * <p>
 *     Concrete strategy - for credit card payment
 * </p>
 */
public class CreditCardPayment implements PaymentStrategy {

    private final String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using credit card ending in "
                + cardNumber.substring(cardNumber.length() - 4));
    }
}
