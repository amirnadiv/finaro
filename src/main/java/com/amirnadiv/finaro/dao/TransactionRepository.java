package com.amirnadiv.finaro.dao;

import com.amirnadiv.finaro.model.TransactionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {

    TransactionEntity findTransactionEntityById(Long id);

}