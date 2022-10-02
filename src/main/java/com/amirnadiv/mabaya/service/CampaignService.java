package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("CampaignService")
@Configurable
public interface CampaignService {
     void createCampaign(Campaign campaign);
     void updateCampaign(String id, Campaign campaign);
     void deleteCampaign(String id);
     Collection<Campaign> getCampaigns();

}
