package com.amirnadiv.mabaya.controller;


import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.service.CampaignService;
import com.amirnadiv.mabaya.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/createCampaign", method = RequestMethod.POST,
            produces = "application/json")
    public Campaign createCampaign(@RequestBody Campaign campaign) {
        Campaign newCampaign = campaignService.createCampaign(campaign);
        return newCampaign;
    }

    @PostMapping("/serveAdMaxValue")
    public Integer serveAdMaxValue(@RequestBody Integer categoryNumber) {
        return productService.serveAdMaxValue(categoryNumber);
    }

    @PostMapping("/serveAd")
    public Product serveAd(@RequestBody Integer categoryNumber) {
        return productService.serveAd(categoryNumber);
    }


}