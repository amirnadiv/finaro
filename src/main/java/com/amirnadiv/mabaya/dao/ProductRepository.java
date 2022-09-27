package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<ProductEntity, Integer> {

    @Query(value = "SELECT a.id as productId\n" +
            "FROM\n" +
            "    PRODUCTS a,\n" +
            "    PRODUCT_CAMPAIGN b\n" +
            "WHERE\n" +
            "        a.price = (\n" +
            "        Select max(a.price)\n" +
            "        From a\n" +
            "        where a.id=b.productId AND b.campaignId=campaignNumber )\n",nativeQuery = true)
    Product serveAd(Integer campaignNumber);
}

