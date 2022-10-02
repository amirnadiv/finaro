package com.amirnadiv.mabaya.service;

import java.util.*;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductBL productBL;

    @Override
    public void createProduct(Product product) {
        productBL.put(product.getId(), product);
    }
    @Override
    public void updateProduct(String id, Product product) {
        productBL.remove(id);
        product.setId(id);
        productBL.put(id, product);
    }
    @Override
    public void deleteProduct(String id) {
        productBL.remove(id);

    }
    @Override
    public Collection<Product> getProducts() {
        return productBL.getAllProducts();
    }

    @Override
    public Product serveAd(Integer campaignNumber) {
        return productBL.serveAd(campaignNumber);
    }
}