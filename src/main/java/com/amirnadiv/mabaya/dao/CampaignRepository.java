package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.CampaignEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface CampaignRepository extends CrudRepository<CampaignEntity, Long> {

    @Query(value = "INSERT INTO CAMPAIGNS VALUES (3, :name,:bid,:startDate,:products);",nativeQuery = true)
    CampaignEntity createCampaign (String name, LocalDateTime startDate, List<Product> products, Double bid);


}