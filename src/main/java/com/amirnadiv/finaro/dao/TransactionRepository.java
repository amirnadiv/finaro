package com.amirnadiv.finaro.dao;

import com.amirnadiv.finaro.model.TransactionEntity;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<TransactionEntity, Long> {


}