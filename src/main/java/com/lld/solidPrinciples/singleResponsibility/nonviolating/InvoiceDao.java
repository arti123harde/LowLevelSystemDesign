package com.lld.solidPrinciples.singleResponsibility.nonviolating;

/**
 * @author Arti Harde
 */
public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving Invoice for Marker " + invoice.marker + " to DB");
    }

}
