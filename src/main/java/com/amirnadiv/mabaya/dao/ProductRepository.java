package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

    @Query(value = "Select max(BID) From PRODUCTS , PRODUCT_CAMPAIGN where PRODUCTS.ID = PRODUCT_CAMPAIGN.PRODUCT_ID and PRODUCT_CAMPAIGN.CAMPAIGN_ID=2",nativeQuery = true)
    Integer serveAdMaxValue(Integer campaignNumber);

    @Query(value = "SELECT * FROM PRODUCTS where PRODUCTS.id=1",nativeQuery = true)
//    @Query(value = "Select 1 From PRODUCTS , PRODUCT_CAMPAIGN where PRODUCTS.ID = PRODUCT_CAMPAIGN.PRODUCT_ID ",nativeQuery = true)
    ProductEntity serveAd(Integer campaignNumber);

}

