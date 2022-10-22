package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("transactionService")
@Configurable
public interface TransactionService {

     Transaction createTransaction(Transaction transaction);

    Transaction getTransaction(Long categoryNumber);

     Collection<Transaction> getAllTransactions();


}
