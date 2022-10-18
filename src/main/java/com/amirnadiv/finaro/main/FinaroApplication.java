package com.amirnadiv.finaro.main;

import com.amirnadiv.finaro.bl.CardBL;
import com.amirnadiv.finaro.bl.CardHolderBL;
import com.amirnadiv.finaro.controller.FinaroController;
import com.amirnadiv.finaro.dao.CardHolderRepository;
import com.amirnadiv.finaro.dto.Card;
import com.amirnadiv.finaro.model.CardEntity;
import com.amirnadiv.finaro.model.CardHolderEntity;
import com.amirnadiv.finaro.service.CardHolderService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = "com.amirnadiv.finaro")
@ComponentScan(basePackageClasses = {FinaroController.class, CardHolderService.class, CardHolderBL.class, CardBL.class, Card.class, ModelMapper.class})
@EntityScan(basePackageClasses = {CardEntity.class, CardHolderEntity.class,})
@EnableJpaRepositories(basePackageClasses = {CardHolderRepository.class})
public class FinaroApplication {

    public static void main(String[] args) {

        SpringApplication.run(FinaroApplication.class, args);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
