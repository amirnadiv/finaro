package com.amirnadiv.mabaya.controller;


import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.CampaignService;
import com.amirnadiv.mabaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class MabayaController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CampaignService campaignService;

    @GetMapping("/")
    public String index() {
        return "Mabaya Application is Up and Running :-) ";
    }

    @PostMapping("/createCampaign")
    public Campaign createCampaign (@RequestParam String name, @RequestParam LocalDateTime startDate, @RequestParam List<Product> products, @RequestParam Double bid) {
      return campaignService.createCampaign(name,  startDate, products, bid);
    }

    @PostMapping("/serveAdMaxValue")
    public Integer serveAdMaxValue (@RequestBody Integer categoryNumber) {
        return productService.serveAdMaxValue(categoryNumber);
    }

    @PostMapping("/serveAd")
    public Product serveAd (@RequestBody Integer categoryNumber) {
        return productService.serveAd(categoryNumber);
    }


}