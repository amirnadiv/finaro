package com.amirnadiv.finaro.bl;

import com.amirnadiv.finaro.dao.TransactionRepository;
import com.amirnadiv.finaro.dto.Transaction;
import com.amirnadiv.finaro.model.TransactionEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class TransactionBLImpl implements TransactionBL {

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public Transaction createTransaction(Transaction transaction) {
        TransactionEntity entity = modelMapper.map(transaction, TransactionEntity.class);
        TransactionEntity newEntity = transactionRepository.save(entity);
        return modelMapper.map(newEntity, Transaction.class);

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
    public Transaction getTransaction(Long id) {
        TransactionEntity byId = transactionRepository.findTransactionEntityById(Long.valueOf(id));
        Transaction map = modelMapper.map(byId, Transaction.class);
        return map;
    }
}
