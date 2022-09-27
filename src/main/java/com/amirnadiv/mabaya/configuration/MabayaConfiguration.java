package com.amirnadiv.mabaya.configuration;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.bl.ProductBLImpl;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.ProductService;
import com.amirnadiv.mabaya.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MabayaConfiguration {

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl();
    }

    @Bean
    public ProductBL productBL() {
        return new ProductBLImpl();
    }

//    @Bean
//    public Product product() {
//        return new Product();
//    }




}



