package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.CardBL;
import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    CardBL cardBL;


    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Transaction getTransaction(Integer id) {
        return null;
    }

    @Override
    public Collection<Transaction> getAllTransactions() {
        return null;
    }
}