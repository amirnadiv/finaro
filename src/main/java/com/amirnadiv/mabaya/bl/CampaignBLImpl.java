package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dao.CampaignRepository;
import com.amirnadiv.mabaya.dto.Campaign;

import java.util.Collection;


public class CampaignBLImpl implements  CampaignBL{

//    @Autowired
    CampaignRepository campaignRepository;

    public void createCampaign(Campaign campaign) {

    }

    public void updateCampaign(String id, Campaign campaign) {

    }

    public void deleteCampaign(String id) {

    }


    @Override
    public void put(String id, Campaign campaign) {

    }

    @Override
    public void remove(String id) {

    }

    @Override
    public Collection<Campaign> getAllCampaigns() {
        return null;
    }
}
