package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Component("productBL")
@Configurable
public interface ProductBL {

    void createProduct(Product product);
    void updateProduct(String id, Product product);
    void deleteProduct(String id);
    Collection<Product> getProducts();

    void put(String id, Product shirt);

    void remove(String id);

    Collection<Product> getAllProducts();

    Product serveAd(Integer campaignNumber);

}
