package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dao.CampaignRepository;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.CampaignEntity;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class CampaignBLImpl implements CampaignBL {

    @Autowired
    CampaignRepository campaignRepository;

    @Autowired
    ModelMapper modelMapper;

    public Campaign createCampaign(Campaign campaign) {

        List<ProductEntity> productEntities = new ArrayList<>();
        if (campaign.getProducts() != null) {
            for (Product product : campaign.getProducts()) {
                ProductEntity productEntity = modelMapper.map(product, ProductEntity.class);
                productEntities.add(productEntity);
            }
        }

        CampaignEntity campaignEntity = modelMapper.map(campaign, CampaignEntity.class);


        campaignEntity = campaignRepository.save(campaignEntity);
        Campaign newCampaign;
        if (campaignEntity != null) {
            newCampaign = modelMapper.map(campaignEntity, Campaign.class);
        } else {
            newCampaign = new Campaign();
        }
        return newCampaign;


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
