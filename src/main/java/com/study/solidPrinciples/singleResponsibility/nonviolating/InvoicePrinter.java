package com.study.solidPrinciples.singleResponsibility.nonviolating;

/**
 * @author Arti Harde
 */
public class InvoicePrinter {

    Invoice invoice;

    public InvoicePrinter(Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice() {
        System.out.println("Printing Invoice = " + invoice);
    }
}
