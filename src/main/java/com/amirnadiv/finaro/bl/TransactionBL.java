package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dto.Transaction;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service("transactionBL")
@Configurable
public interface TransactionBL {

    Transaction createTransaction(Transaction transaction);

    Collection<Transaction> getAllTransactions();

    Optional<Transaction> getTransaction(Integer id);
}
