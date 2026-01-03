package com.study.solidPrinciples.openClosed.nonviolating;

import com.study.solidPrinciples.openClosed.Invoice;

/**
 * @author Arti Harde
 */
public class DatabaseInvoiceDao implements InvoiceDao{

    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving Invoice for Marker " + invoice.marker + " to DB");
    }
}
