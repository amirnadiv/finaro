package com.amirnadiv.finaro.service;

import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service("transactionService")
@Configurable
public interface TransactionService {

     Transaction createTransaction(Transaction transaction);

    Optional<Transaction> getTransaction(Integer categoryNumber);

     Collection<Transaction> getAllTransactions();


}
