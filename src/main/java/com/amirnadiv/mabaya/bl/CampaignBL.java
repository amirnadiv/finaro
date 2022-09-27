package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface CampaignBL {

    void createCampaign(Campaign campaign);
    void updateCampaign(String id, Campaign campaign);
    void deleteCampaign(String id);

    void put(String id, Campaign shirt);

    void remove(String id);

    Collection<Campaign> getAllCampaigns();
}
