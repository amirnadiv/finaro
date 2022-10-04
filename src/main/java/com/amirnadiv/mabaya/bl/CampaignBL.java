package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Component
public interface CampaignBL {

    Campaign createCampaign(String name, LocalDateTime startDate, List<Product> products, Double bid);
    void updateCampaign(String id, Campaign campaign);
    void deleteCampaign(String id);

    void put(String id, Campaign shirt);

    void remove(String id);

    Collection<Campaign> getAllCampaigns();
}
