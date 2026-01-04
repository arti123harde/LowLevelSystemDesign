package com.lld.designPatterns.behavioral.strategy.courierExample.solution;

/**
 * @author Arti Harde
 */
public class FlatFeeStrategy implements ShippingCostStrategy {

    private static final double FLAT_FEE = 100.0;

    @Override
    public double calculateCost(Shipment shipment) {
        return applyPremiumDiscount(FLAT_FEE, shipment);
    }

    protected double applyPremiumDiscount(double cost, Shipment shipment) {
        return shipment.isPremiumMember() ? cost * 0.9 : cost;
    }

}