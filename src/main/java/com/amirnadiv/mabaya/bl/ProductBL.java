package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("productBL")
@Configurable
public interface ProductBL {

    void createProduct(Product product);
    void updateProduct(Long id, Product product);
    void deleteProduct(Long id);
    Collection<Product> getProducts();

    void put(Long id, Product shirt);

    void remove(Long id);

    Collection<Product> getAllProducts();

    Integer serveAdMaxValue(Integer campaignNumber);

    Product serveAd(Integer categoryNumber);
}
