package com.lld.designPatterns.behavioral.strategy.courierExample.solution;


/**
 * @author Arti Harde
 */
public interface ShippingCostStrategy {

    double calculateCost(Shipment shipment);
}
