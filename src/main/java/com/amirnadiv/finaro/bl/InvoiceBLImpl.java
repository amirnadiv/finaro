package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.CardRepository;
import com.amirnadiv.finaro.dto.Invoice;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class InvoiceBLImpl implements InvoiceBL {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public Invoice createInvoice(Invoice campaign) {
        return null;
    }

    @Override
    public Collection<Invoice> getAllInvoices() {
        return null;
    }

}
