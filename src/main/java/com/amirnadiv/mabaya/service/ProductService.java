package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("productService")
@Configurable
public interface ProductService {
     void createProduct(Product product);
     void updateProduct(Long id, Product product);
     void deleteProduct(Long id);

     Collection<Product> getAllProducts();

     Integer serveAdMaxValue(Integer campaignNumber);

     Product serveAd(Integer categoryNumber);
}
