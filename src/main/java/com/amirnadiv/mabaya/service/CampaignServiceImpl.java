package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.bl.CampaignBL;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Component
public class CampaignServiceImpl implements CampaignService {


    CampaignBL campaignBL;

    @Override
    public Campaign createCampaign(String name, LocalDateTime startDate, List<Product> products, Double bid) {
        return campaignBL.createCampaign( name,   startDate,  products,   bid);
    }
    @Override
    public void updateCampaign(String id, Campaign campaign) {

    }
    @Override
    public void deleteCampaign(String id) {
        campaignBL.remove(id);

    }

    @Override
    public Collection<Campaign> getCampaigns() {
        return campaignBL.getAllCampaigns();
    }
}