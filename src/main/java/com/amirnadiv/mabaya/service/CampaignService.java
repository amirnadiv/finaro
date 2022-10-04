package com.amirnadiv.mabaya.service;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service("CampaignService")
@Configurable
public interface CampaignService {
     void updateCampaign(String id, Campaign campaign);
     void deleteCampaign(String id);
     Collection<Campaign> getCampaigns();

     Campaign createCampaign(String name, LocalDateTime startDate, List<Product> products, Double bid);
}
