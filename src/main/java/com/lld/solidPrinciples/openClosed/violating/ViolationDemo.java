package com.lld.solidPrinciples.openClosed.violating;

import com.lld.solidPrinciples.openClosed.Invoice;
import com.lld.solidPrinciples.openClosed.Marker;

/**
 * @author Arti Harde
 */
public class ViolationDemo {

    public static void main(String[] args) {
        Marker marker = new Marker("name", "color", 10, 2020);
        Invoice invoice = new Invoice(marker, 10);

        //Violating OCP
        System.out.println("--------------------- Violating OCP --------------------- ");
        InvoiceDao invoiceDao = new InvoiceDao(invoice);
        invoiceDao.saveToDB();
        invoiceDao.saveToFile();
    }
}
