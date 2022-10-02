package com.amirnadiv.mabaya.configuration;

import com.amirnadiv.mabaya.bl.CampaignBL;
import com.amirnadiv.mabaya.bl.CampaignBLImpl;
import com.amirnadiv.mabaya.bl.ProductBL;
import com.amirnadiv.mabaya.bl.ProductBLImpl;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.CampaignService;
import com.amirnadiv.mabaya.service.CampaignServiceImpl;
import com.amirnadiv.mabaya.service.ProductService;
import com.amirnadiv.mabaya.service.ProductServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
public class MabayaConfiguration {

    @Bean
    public ProductService productService() {
        return new ProductServiceImpl();
    }

    @Bean
    public ProductBL productBL() {
        return new ProductBLImpl();
    }

    @Bean
    public CampaignService campaignService() {
        return new CampaignServiceImpl();
    }

    @Bean
    public CampaignBL campaignBL() {
        return new CampaignBLImpl();
    }




}



