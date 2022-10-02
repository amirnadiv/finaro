package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dao.ProductRepository;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Collection;

@Component
public class ProductBLImpl implements  ProductBL{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

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


    @Override
    public Integer serveAdMaxValue(Integer campaignNumber) {
        return productRepository.serveAdMaxValue( campaignNumber);
    }

    @Override
    public Product serveAd(Integer campaignNumber) {
        ProductEntity productEntity = productRepository.serveAd(campaignNumber);
        Product product = modelMapper.map(productEntity, Product.class);
        return product;
    }
}
