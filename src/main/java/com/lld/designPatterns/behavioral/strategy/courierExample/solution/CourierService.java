package com.lld.designPatterns.behavioral.strategy.courierExample.solution;

/**
 * @author Arti Harde
 */
public class CourierService {

    private final ShippingCostStrategy shippingCostStrategy;

    public CourierService(ShippingCostStrategy shippingCostStrategy) {
        this.shippingCostStrategy = shippingCostStrategy;
    }

    public double calculateShippingCost(Shipment shipment) {
        return shippingCostStrategy.calculateCost(shipment);
    }
}
