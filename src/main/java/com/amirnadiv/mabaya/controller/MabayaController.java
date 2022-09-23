package com.amirnadiv.mabaya.controller;


import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.enums.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MabayaController {

    @GetMapping("/")
    public String index() {
        return "Mabaya Application is Up and Running :-) ";
    }

    @PostMapping("/createCampaign")
    public Campaign createCampaign (@RequestParam String name, @RequestParam Date startDate, @RequestParam List<Product> products, @RequestParam Double bid) {
      return new Campaign();
    }

    @PostMapping("/createCampaign")
    public Product createCampaign (@RequestParam Category category) {

        return new Product();
    }


}