package com.study.solidPrinciples.openClosed.violating;

import com.study.solidPrinciples.openClosed.Invoice;
import com.study.solidPrinciples.openClosed.Marker;
import com.study.solidPrinciples.openClosed.nonviolating.DatabaseInvoiceDao;
import com.study.solidPrinciples.openClosed.nonviolating.FileInvoiceDao;

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
