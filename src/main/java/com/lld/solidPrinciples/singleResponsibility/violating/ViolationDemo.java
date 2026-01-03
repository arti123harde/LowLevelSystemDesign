package com.lld.solidPrinciples.singleResponsibility.violating;

import com.lld.solidPrinciples.singleResponsibility.Marker;

/**
 * @author Arti Harde
 */
public class ViolationDemo {

    public static void main(String[] args) {
        System.out.println("--------------------- Violating SRP --------------------- ");
        InvoiceOperations invoiceOperations = new InvoiceOperations(new Marker("name", "color", 10,
                2020), 10);
        invoiceOperations.calculateTotal();
        invoiceOperations.saveToDB();
        invoiceOperations.printInvoice();
    }
}
