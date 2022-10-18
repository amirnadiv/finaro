package com.amirnadiv.finaro.dao;

import com.amirnadiv.finaro.model.CardHolderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardHolderRepository extends CrudRepository<CardHolderEntity, Long> {


}

