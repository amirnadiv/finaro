package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("productService")
@Configurable
public interface ProductService {
     void createProduct(Product product);
     void updateProduct(String id, Product product);
     void deleteProduct(String id);
     Collection<Product> getProducts();

     Integer serveAdMaxValue(Integer campaignNumber);

     Product serveAd(Integer campaignNumber);
}
