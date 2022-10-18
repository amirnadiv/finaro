package com.amirnadiv.finaro.configuration;

import com.amirnadiv.finaro.bl.CardBL;
import com.amirnadiv.finaro.bl.CardBLImpl;
import com.amirnadiv.finaro.bl.CardHolderBL;
import com.amirnadiv.finaro.bl.CardHolderBLImpl;
import com.amirnadiv.finaro.service.CardHolderService;
import com.amirnadiv.finaro.service.CardHolderServiceImpl;
import com.amirnadiv.finaro.service.CardService;
import com.amirnadiv.finaro.service.CardServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class FinaroConfiguration {

    @Bean
    public CardHolderService cardHolderService() {
        return new CardHolderServiceImpl();
    }

    @Bean
    public CardHolderBL cardHolderBL() {
        return new CardHolderBLImpl();
    }

    @Bean
    public CardService cardService() {
        return new CardServiceImpl();
    }

    @Bean
    public CardBL cardBL() {
        return new CardBLImpl();
    }






}



