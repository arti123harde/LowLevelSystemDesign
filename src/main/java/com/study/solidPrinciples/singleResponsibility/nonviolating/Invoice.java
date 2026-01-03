package com.study.solidPrinciples.singleResponsibility.nonviolating;

import com.study.solidPrinciples.singleResponsibility.Marker;

/**
 * @author Arti Harde
 * <p>
 * GOOD: Following SRP - Each class has a Single Responsibility.
 * Responsibility: Managing Invoice data only
 */
public class Invoice {

    Marker marker;
    int quantity;
    int total;

    public Invoice(Marker marker, int quantity) {
        this.quantity = quantity;
        this.marker = marker;
    }

    public void calculateTotal() {
        this.total = this.marker.price * this.quantity;
        System.out.println("Calculated Total = " + total);
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "marker=" + marker +
                ", quantity=" + quantity +
                ", total=" + total +
                '}';
    }
}
