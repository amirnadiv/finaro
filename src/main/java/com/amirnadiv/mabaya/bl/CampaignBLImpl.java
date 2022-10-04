package com.amirnadiv.mabaya.bl;

import com.amirnadiv.mabaya.dao.CampaignRepository;
import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.dto.Product;
import com.amirnadiv.mabaya.model.CampaignEntity;
import com.amirnadiv.mabaya.model.ProductEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;


public class CampaignBLImpl implements  CampaignBL{

    @Autowired
    CampaignRepository campaignRepository;

    @Autowired
    ModelMapper modelMapper;

    public Campaign createCampaign(String name, LocalDateTime startDate, List<Product> products, Double bid) {

        CampaignEntity campaignEntity = campaignRepository.createCampaign( name,   startDate, products,   bid) ;
        Campaign newCampaign;
        if (campaignEntity !=null) {
            newCampaign = modelMapper.map(campaignEntity, Campaign.class);
        }
        else {newCampaign = new Campaign(); }
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
