package com.study.solidPrinciples.singleResponsibility.nonviolating;

import com.study.solidPrinciples.singleResponsibility.Marker;
import com.study.solidPrinciples.singleResponsibility.violating.InvoiceOperations;

/**
 * @author Arti Harde
 */
public class NonViolationDemo {

    public static void main(String[] args) {
        System.out.println("--------------------- Non Violating SRP --------------------- ");
        Marker marker = new Marker("name", "color", 10, 2020);
        Invoice invoice = new Invoice(marker, 2);
        invoice.calculateTotal();
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);
        invoicePrinter.printInvoice();
    }
}
