package com.study.solidPrinciples.singleResponsibility.violating;

import com.study.solidPrinciples.singleResponsibility.Marker;
import com.study.solidPrinciples.singleResponsibility.nonviolating.Invoice;
import com.study.solidPrinciples.singleResponsibility.nonviolating.InvoiceDao;
import com.study.solidPrinciples.singleResponsibility.nonviolating.InvoicePrinter;

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
