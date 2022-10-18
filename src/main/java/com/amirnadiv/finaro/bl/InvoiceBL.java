package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dto.Invoice;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("invoiceBL")
@Configurable
public interface InvoiceBL {

    Invoice createInvoice(Invoice campaign);

    Collection<Invoice> getAllInvoices();
}
