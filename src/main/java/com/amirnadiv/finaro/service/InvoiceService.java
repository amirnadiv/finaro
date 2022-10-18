package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.dto.Invoice;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("invoiceService")
@Configurable
public interface InvoiceService {
     Invoice createInvoice(Invoice invoice);

     Collection<Invoice> getAllInvoices();
}
