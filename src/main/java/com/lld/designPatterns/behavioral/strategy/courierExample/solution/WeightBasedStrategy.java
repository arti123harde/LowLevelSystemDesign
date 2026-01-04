package com.lld.designPatterns.behavioral.strategy.courierExample.solution;

/**
 * @author Arti Harde
 */
public class WeightBasedStrategy implements ShippingCostStrategy {

    private static final double COST_PER_KG = 20.0;

    @Override
    public double calculateCost(Shipment shipment) {
        double cost = shipment.getWeightKg() * COST_PER_KG;
        return applyPremiumDiscount(cost, shipment);
    }

    protected double applyPremiumDiscount(double cost, Shipment shipment) {
        return shipment.isPremiumMember() ? cost * 0.9 : cost;
    }
}
