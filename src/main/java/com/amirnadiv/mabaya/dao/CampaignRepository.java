package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.dto.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Integer> {
    List<Campaign> findByPublished(boolean published);

    List<Campaign> findByTitleContaining(String title);
}