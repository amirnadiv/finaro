package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.bl.CampaignBL;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CampaignServiceImpl implements CampaignService {


    CampaignBL campaignBL;

    @Override
    public void createCampaign(Campaign campaign) {
        campaignBL.put(campaign.getId(), campaign);
    }
    @Override
    public void updateCampaign(String id, Campaign campaign) {
        campaignBL.remove(id);
        campaign.setId(id);
        campaignBL.put(id, campaign);
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