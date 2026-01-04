package com.lld.designPatterns.behavioral.strategy.courierExample.solution;

/**
 * @author Arti Harde
 */
public class DistanceBasedStrategy implements ShippingCostStrategy {

    private static final double COST_PER_KM = 10.0;

    @Override
    public double calculateCost(Shipment shipment) {
        double cost = shipment.getDistanceKm() * COST_PER_KM;
        return applyPremiumDiscount(cost, shipment);
    }

    protected double applyPremiumDiscount(double cost, Shipment shipment) {
        return shipment.isPremiumMember() ? cost * 0.9 : cost;
    }
}
