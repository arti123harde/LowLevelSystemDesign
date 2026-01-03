package com.study.solidPrinciples.openClosed.violating;


import com.study.solidPrinciples.openClosed.Invoice;

/**
 * @author Arti Harde
 *
 * Bad Design : saving invoice to File feature is added to existing class
 */
public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving Invoice for Marker " + invoice.marker + " to DB");
    }

    public void saveToFile() {
        System.out.println("Saving Invoice for Marker " + invoice.marker + " to File");
    }

}
