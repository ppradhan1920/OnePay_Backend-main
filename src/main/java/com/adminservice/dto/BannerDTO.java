package com.adminservice.dto;

import com.adminservice.entity.AdminEntity;
import com.adminservice.entity.BannerEntity;
import com.adminservice.entity.CatagoryEntity;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerDTO {
    
	private Long bannerId;
	private Long catagoryEntity;
	private Long adminEntity;
	private String bannerName;
	private Double rewardAmt;
	private String desc;
	private String bottomTxt;
	private String points;
	private String iconImage;
	private String bnrImage;
	private String appUrl;
	private String offerName;
	private Double discountPrice;
	private Boolean isPublish;
	private Boolean isTermCond;
	private String termCondition;
	private Boolean isActive=true;

}
