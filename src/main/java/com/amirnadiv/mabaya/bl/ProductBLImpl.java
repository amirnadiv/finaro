package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dao.ProductRepository;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class ProductBLImpl implements  ProductBL{

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ModelMapper modelMapper;

    public void createProduct(Product product) {

    }

    public void updateProduct(Long id, Product product) {

    }

    public void deleteProduct(Long id) {

    }

    public Collection<Product> getProducts() {
        return null;
    }

    @Override
    public void put(Long id, Product shirt) {

    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public Collection<Product> getAllProducts() {
        Iterable<ProductEntity> productEntities = productRepository.findAll();
        Collection<Product> productCollection = new ArrayList<>();
        for (ProductEntity productEntity : productEntities) {
            Product product = modelMapper.map(productEntity, Product.class);
            productCollection.add(product);
        }

        return productCollection;
    }


    @Override
    public Integer serveAdMaxValue(Integer campaignNumber) {
        return productRepository.serveAdMaxValue( campaignNumber);
    }

    @Override
    public Product serveAd(Integer categoryNumber) {
        ProductEntity productEntity = productRepository.serveAd(categoryNumber);
        Product product;
        if (productEntity !=null) {
            product = modelMapper.map(productEntity, Product.class);
        }
        else {product = new Product(); }
        return product;
    }
}
