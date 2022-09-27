package com.amirnadiv.mabaya.service;

import java.util.*;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.enums.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



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
}