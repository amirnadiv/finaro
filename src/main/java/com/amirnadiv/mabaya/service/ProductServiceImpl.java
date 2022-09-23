package com.amirnadiv.mabaya.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.enums.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    static
    ProductBL productBL;
    static {
        Product shirt = new Product();
        shirt.setId("1");
        shirt.setTitle("product1");
        shirt.setPrice(10.0);
        shirt.setCategory(Category.getRandomCategory());
        productBL.put(shirt.getId(), shirt);

        Product pants = new Product();
        pants.setId("2");
        pants.setTitle("product2");
        pants.setPrice(20.0);
        pants.setCategory(Category.getRandomCategory());
        productBL.put(pants.getId(), pants);

        Product bible = new Product();
        pants.setId("3");
        pants.setTitle("product3");
        pants.setPrice(30.0);
        pants.setCategory(Category.getRandomCategory());
        productBL.put(pants.getId(), pants);
    }
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