package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.model.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

    @Query(value = "Select max(BID) From PRODUCTS , PRODUCT_CAMPAIGN where PRODUCTS.ID = PRODUCT_CAMPAIGN.PRODUCT_ID and PRODUCT_CAMPAIGN.CAMPAIGN_ID=:campaignNumber",nativeQuery = true)
    Integer serveAdMaxValue(Integer campaignNumber);

    @Query(value = "Select * From PRODUCTS where  PRODUCTS.category = :categoryNumber and PRODUCTS.bid = (SELECT MAX(bid) FROM PRODUCTS)",nativeQuery = true)
    ProductEntity serveAd(@Param("categoryNumber") Integer categoryNumber); // todo amirn : add unique to query

}

