package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.CardRepository;
import com.amirnadiv.finaro.dto.Transaction;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class TransactionBLImpl implements TransactionBL {

    @Autowired
    CardRepository cardRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Collection<Transaction> getAllTransactions() {
        return null;
    }
}
