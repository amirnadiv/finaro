package com.amirnadiv.mabaya.main;

import com.amirnadiv.mabaya.configuration.MabayaConfiguration;
import com.amirnadiv.mabaya.controller.MabayaController;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.ProductService;
import com.amirnadiv.mabaya.service.ProductServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages="com.amirnadiv.mabaya")
@ComponentScan(basePackageClasses= {MabayaController.class, ProductService.class, Product.class, Campaign.class})
@EntityScan(basePackageClasses = {com.amirnadiv.mabaya.model.ProductEntity.class,com.amirnadiv.mabaya.model.CampaignEntity.class,})
@EnableJpaRepositories("com.amirnadiv.mabaya.dao")
public class MabayaApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(MabayaConfiguration.class);
        ctx.refresh();
        //ProductService productService = ctx.getBean("productService",ProductServiceImpl.class);
        ctx.close();
        SpringApplication.run(MabayaApplication.class, args);
    }

}
