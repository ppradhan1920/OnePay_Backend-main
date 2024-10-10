package com.adminservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminservice.dto.BannerDTO;
import com.adminservice.entity.AdminEntity;
import com.adminservice.entity.BannerEntity;
import com.adminservice.entity.CatagoryEntity;
import com.adminservice.repository.BannerRepo;

@Service
public class BannerService {
	@Autowired
    private BannerRepo bannerRepo;

    public BannerDTO createBanner(BannerDTO bannerDTO) {
     CatagoryEntity catagoryEntityData=new CatagoryEntity();
     catagoryEntityData.setCatagoryId(bannerDTO.getCatagoryEntity());
     AdminEntity adminEntityData = new AdminEntity();
     adminEntityData.setAdminId(bannerDTO.getAdminEntity());
	// Convert BannerDTO to BannerEntity
    BannerEntity bannerEntity = BannerEntity.builder()
            .catagoryEntity(catagoryEntityData)
            .adminEntity(adminEntityData)
            .bannerName(bannerDTO.getBannerName())
            .rewardAmt(bannerDTO.getRewardAmt())
            .desc(bannerDTO.getDesc())
            .bottomTxt(bannerDTO.getBottomTxt())
            .points(bannerDTO.getPoints())
            .iconImage(bannerDTO.getIconImage())
            .bnrImage(bannerDTO.getBnrImage())
            .appUrl(bannerDTO.getAppUrl())
            .offerName(bannerDTO.getOfferName())
            .discountPrice(bannerDTO.getDiscountPrice())
            .isPublish(bannerDTO.getIsPublish())
            .isTermCond(bannerDTO.getIsTermCond())
            .termCondition(bannerDTO.getTermCondition())
            .isActive(bannerDTO.getIsActive())
            .build();

    // Save BannerEntity to the repository
    BannerEntity savedBannerEntity = bannerRepo.save(bannerEntity);

    // Convert BannerEntity back to BannerDTO
    return BannerDTO.builder()
            .bannerId(savedBannerEntity.getBannerId())
            .catagoryEntity(savedBannerEntity.getCatagoryEntity().getCatagoryId())
            .adminEntity(savedBannerEntity.getAdminEntity().getAdminId())
            .bannerName(savedBannerEntity.getBannerName())
            .rewardAmt(savedBannerEntity.getRewardAmt())
            .desc(savedBannerEntity.getDesc())
            .bottomTxt(savedBannerEntity.getBottomTxt())
            .points(savedBannerEntity.getPoints())
            .iconImage(savedBannerEntity.getIconImage())
            .bnrImage(savedBannerEntity.getBnrImage())
            .appUrl(savedBannerEntity.getAppUrl())
            .offerName(savedBannerEntity.getOfferName())
            .discountPrice(savedBannerEntity.getDiscountPrice())
            .isPublish(savedBannerEntity.getIsPublish())
            .isTermCond(savedBannerEntity.getIsTermCond())
            .termCondition(savedBannerEntity.getTermCondition())
            .isActive(savedBannerEntity.getIsActive())
            .build();
}
    
    
}


