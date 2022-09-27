package com.amirnadiv.mabaya.main;

import com.amirnadiv.mabaya.controller.MabayaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses= MabayaController.class)
public class MabayaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MabayaApplication.class, args);
    }

}
