package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.bl.CampaignBL;
import com.amirnadiv.mabaya.dto.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CampaignServiceImpl implements CampaignService {


    @Autowired
    CampaignBL campaignBL;

    @Override
    public Campaign createCampaign(Campaign campaign) {
        return campaignBL.createCampaign(campaign);
    }


    @Override
    public void deleteCampaign(String id) {
        campaignBL.remove(id);
    }

    @Override
    public Collection<Campaign> getAllCampaigns() {
        return campaignBL.getAllCampaigns();
    }
}