package com.amirnadiv.mabaya.dao;

import com.amirnadiv.mabaya.model.CampaignEntity;
import org.springframework.data.repository.CrudRepository;

public interface CampaignRepository extends CrudRepository<CampaignEntity, Long> {


//
//    @Query(value = "INSERT INTO CAMPAIGNS VALUES ( :name,:bid,:startDate,:products);",nativeQuery = true)
//    CampaignEntity createCampaign (String name, LocalDateTime startDate, List<ProductEntity> products, Double bid);
//

}