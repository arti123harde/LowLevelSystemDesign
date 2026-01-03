package com.study.solidPrinciples.singleResponsibility.violating;

import com.study.solidPrinciples.singleResponsibility.Marker;

/**
 * @author Arti Harde
 *
 * BAD: This class violates SRP by having multiple responsibilities
 */
public class InvoiceOperations {

    private final Marker marker;
    private final int quantity;

    public InvoiceOperations(Marker marker, int quantity) {
        this.quantity = quantity;
        this.marker = marker;
    }

    // Responsibility 1: Calculate the total(business logic)
    public void calculateTotal() {
        int total = this.marker.price * this.quantity;
        System.out.println("Calculated Total = " + total);
    }

    // Responsibility 2: Database Operations
    public void saveToDB() {
        System.out.println("Saving Invoice for Marker " + marker + " to DB");
    }

    // Responsibility 3: Print the Invoice
    public void printInvoice() {
        System.out.println("Printing Invoice for Marker = " + marker);
    }
}
