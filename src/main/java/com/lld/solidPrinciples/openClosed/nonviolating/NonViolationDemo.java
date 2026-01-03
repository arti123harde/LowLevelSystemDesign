package com.lld.solidPrinciples.openClosed.nonviolating;

import com.lld.solidPrinciples.openClosed.Invoice;
import com.lld.solidPrinciples.openClosed.Marker;

/**
 * @author Arti Harde
 */
public class NonViolationDemo {

    public static void main(String[] args) {
        Marker marker = new Marker("name", "color", 10, 2020);
        Invoice invoice = new Invoice(marker, 10);

        //Non Violating OCP
        System.out.println("--------------------- Non Violating OCP --------------------- ");
        DatabaseInvoiceDao db = new DatabaseInvoiceDao(invoice);
        db.save();
        FileInvoiceDao file = new FileInvoiceDao(invoice);
        file.save();

    }
}
