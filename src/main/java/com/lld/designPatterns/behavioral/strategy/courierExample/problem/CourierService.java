package com.lld.designPatterns.behavioral.strategy.courierExample.problem;

/**
 * @author Arti Harde
 */
public class CourierService {

    public double calculateShippingCost(Shipment shipment, ShippingType type) {

        double cost;

        if (type == ShippingType.FLAT_FEE) {
            cost = 100.0;

        } else if (type == ShippingType.DISTANCE_BASED) {
            cost = shipment.getDistanceKm() * 10.0;

        } else if (type == ShippingType.WEIGHT_BASED) {
            cost = shipment.getWeightKg() * 20.0;

        } else {
            throw new IllegalArgumentException("Invalid shipping type");
        }

        // Premium discount logic
        if (shipment.isPremiumMember()) {
            cost = cost * 0.9;
        }

        return cost;
    }
}
