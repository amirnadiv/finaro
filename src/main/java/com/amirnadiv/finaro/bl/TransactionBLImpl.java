package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.TransactionRepository;
import com.amirnadiv.finaro.dto.Transaction;
import com.amirnadiv.finaro.model.TransactionEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Component
public class TransactionBLImpl implements TransactionBL {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        return null;
    }

    @Override
    public Collection<Transaction> getAllTransactions() {

        Iterable<TransactionEntity> all = transactionRepository.findAll();
        Collection<Transaction> transactions = new ArrayList<>();
        for (TransactionEntity entity : all) {
            Transaction t = modelMapper.map(entity, Transaction.class);
            transactions.add(t);
        }
        return transactions;
    }

    @Override
    public Optional<Transaction> getTransaction(Integer id) {
        Optional<TransactionEntity> entity = transactionRepository.findById(Long.valueOf(id));
        Transaction t = modelMapper.map(entity, Transaction.class);
        return Optional.ofNullable(t);
    }
}
