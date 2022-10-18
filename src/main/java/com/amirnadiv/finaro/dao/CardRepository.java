package com.amirnadiv.finaro.dao;

import com.amirnadiv.finaro.model.CardEntity;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<CardEntity, Long> {


}