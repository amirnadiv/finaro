package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("CampaignService")
public interface CampaignService {
     void createCampaign(Campaign campaign);
     void updateCampaign(String id, Campaign campaign);
     void deleteCampaign(String id);
     Collection<Campaign> getCampaigns();

}
