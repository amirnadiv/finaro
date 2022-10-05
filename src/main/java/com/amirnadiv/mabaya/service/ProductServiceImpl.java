package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductBL productBL;

    @Override
    public void createProduct(Product product) {
        productBL.put(product.getId(), product);
    }
    @Override
    public void updateProduct(Long id, Product product) {
        productBL.remove(id);
        product.setId(id);
        productBL.put(id, product);
    }

    @Override
    public void deleteProduct(Long id) {
        productBL.remove(id);

    }

    @Override
    public Collection<Product> getAllProducts() {
        return productBL.getAllProducts();
    }

    @Override
    public Integer serveAdMaxValue(Integer campaignNumber) {
        return productBL.serveAdMaxValue(campaignNumber);
    }

    @Override
    public Product serveAd(Integer categoryNumber) {

        return productBL.serveAd(categoryNumber);
    }
}