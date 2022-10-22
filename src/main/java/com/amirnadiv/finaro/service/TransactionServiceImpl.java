package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.TransactionBL;
import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    TransactionBL transactionBL;


    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionBL.createTransaction(transaction);
    }

    @Override
    public Transaction getTransaction(Long id) {
        return transactionBL.getTransaction(id);
    }

    @Override
    public Collection<Transaction> getAllTransactions() {
        return transactionBL.getAllTransactions();
    }
}