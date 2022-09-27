package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Campaign;
import com.amirnadiv.mabaya.model.CampaignEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CampaignRepository extends JpaRepository<CampaignEntity, Integer> {

}