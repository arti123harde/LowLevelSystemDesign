package com.lld.designPatterns.behavioral.strategy.courierExample.problem;

/**
 * @author Arti Harde
 */
public class MainDriver {

    public static void main(String[] args) {

        Shipment shipment = new Shipment(50, 5, true);

        CourierService courierService = new CourierService();

        double cost = courierService.calculateShippingCost(shipment,  ShippingType.DISTANCE_BASED);
        System.out.println("DISTANCE_BASED Shipping Cost: " + cost);

        cost = courierService.calculateShippingCost(shipment,  ShippingType.FLAT_FEE);
        System.out.println("FLAT_FEE Shipping Cost: " + cost);

        cost = courierService.calculateShippingCost(shipment,  ShippingType.WEIGHT_BASED);
        System.out.println("WEIGHT_BASED Shipping Cost: " + cost);
    }
}
