package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.InvoiceBL;
import com.amirnadiv.finaro.dto.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class InvoiceServiceImpl implements InvoiceService {


    @Autowired
    InvoiceBL invoiceBL;


    @Override
    public Invoice createInvoice(Invoice invoice) {
        return null;
    }

    @Override
    public Collection<Invoice> getAllInvoices() {
        return null;
    }
}