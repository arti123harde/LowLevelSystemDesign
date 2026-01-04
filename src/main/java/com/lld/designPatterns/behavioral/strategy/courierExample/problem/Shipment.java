package com.lld.designPatterns.behavioral.strategy.courierExample.problem;

/**
 * @author Arti Harde
 */
public class Shipment {

    private final double distanceKm;
    private final double weightKg;
    private final boolean premiumMember;

    public Shipment(double distanceKm, double weightKg, boolean premiumMember) {
        this.distanceKm = distanceKm;
        this.weightKg = weightKg;
        this.premiumMember = premiumMember;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public boolean isPremiumMember() {
        return premiumMember;
    }
}
