package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Campaign;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("campaignService")
@Configurable
public interface CampaignService {
     Campaign createCampaign(Campaign campaign);

     void deleteCampaign(String id);

     Collection<Campaign> getAllCampaigns();
}
