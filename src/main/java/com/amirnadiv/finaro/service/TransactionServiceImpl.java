package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.bl.TransactionBL;
import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class TransactionServiceImpl implements TransactionService {


    @Autowired
    TransactionBL transactionBL;


    @Override
    public Transaction createTransaction(Transaction transaction) {
        return transactionBL.createTransaction(transaction);
    }

    @Override
    public Optional<Transaction> getTransaction(Integer id) {
        return transactionBL.getTransaction(id);
    }

    @Override
    public Collection<Transaction> getAllTransactions() {
        return transactionBL.getAllTransactions();
    }
}