package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Campaign;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service("campaignBL")
@Configurable
public interface CampaignBL {

    Campaign createCampaign(Campaign campaign);

    void updateCampaign(String id, Campaign campaign);
    void deleteCampaign(String id);

    void put(String id, Campaign shirt);

    void remove(String id);

    Collection<Campaign> getAllCampaigns();
}
