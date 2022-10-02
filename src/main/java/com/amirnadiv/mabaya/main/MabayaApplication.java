package com.amirnadiv.mabaya.main;

import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.controller.MabayaController;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.amirnadiv.mabaya")
@ComponentScan(basePackageClasses= {MabayaController.class, ProductService.class, ProductBL.class, Product.class, Campaign.class})
@EntityScan(basePackageClasses = {com.amirnadiv.mabaya.model.ProductEntity.class,com.amirnadiv.mabaya.model.CampaignEntity.class,})
@EnableJpaRepositories(basePackageClasses = {com.amirnadiv.mabaya.dao.ProductRepository.class})
public class MabayaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabayaApplication.class, args);
    }

}
