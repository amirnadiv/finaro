package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;


public class ProductBLImpl implements  ProductBL{

    @Autowired
    ProductRepository productRepository;

    public void createProduct(Product product) {

    }

    public void updateProduct(String id, Product product) {

    }

    public void deleteProduct(String id) {

    }

    public Collection<Product> getProducts() {
        return null;
    }

    @Override
    public void put(String id, Product shirt) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Collection<Product> getAllProducts() {
        return null;
    }
}
