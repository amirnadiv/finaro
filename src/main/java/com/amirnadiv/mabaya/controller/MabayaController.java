package com.amirnadiv.mabaya.controller;


import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.CampaignService;
import com.amirnadiv.mabaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class MabayaController {

    private ProductService productService;
    private CampaignService campaignService;

    @GetMapping("/")
    public String index() {
        return "Mabaya Application is Up and Running :-) ";
    }

    @PostMapping("/createCampaign")
    public Campaign createCampaign (@RequestParam String name, @RequestParam Date startDate, @RequestParam List<Product> products, @RequestParam Double bid) {
      return new Campaign();
    }

    @PostMapping("/serveAd")
    public Product serveAd (@RequestBody Integer category) {

        return new Product();
    }


}