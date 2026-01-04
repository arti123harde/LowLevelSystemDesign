package com.lld.designPatterns.behavioral.strategy.courierExample.solution;

import com.lld.designPatterns.behavioral.strategy.courierExample.problem.ShippingType;

/**
 * @author Arti Harde
 */
public class MainDriver {

    public static void main(String[] args) {
        Shipment shipment = new Shipment(50, 5, true);

        CourierService courierService = new CourierService(new DistanceBasedStrategy());
        double cost = courierService.calculateShippingCost(shipment);
        System.out.println("DISTANCE_BASED Shipping Cost: " + cost);

        courierService = new CourierService(new FlatFeeStrategy());
        cost = courierService.calculateShippingCost(shipment);
        System.out.println("FLAT_FEE Shipping Cost: " + cost);

        courierService = new CourierService(new WeightBasedStrategy());
        cost = courierService.calculateShippingCost(shipment);
        System.out.println("WEIGHT_BASED Shipping Cost: " + cost);
    }
}
