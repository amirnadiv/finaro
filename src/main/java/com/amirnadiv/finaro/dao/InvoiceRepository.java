package com.amirnadiv.finaro.dao;

import com.amirnadiv.finaro.model.InvoiceEntity;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceRepository extends CrudRepository<InvoiceEntity, Long> {


}