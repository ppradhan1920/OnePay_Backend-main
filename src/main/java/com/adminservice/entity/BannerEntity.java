package com.adminservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="op_banner_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BannerEntity extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="banner_id")
	private Long bannerId;
	
	@OneToOne
	@JoinColumn(name="fk_catagory_id")
	private CatagoryEntity catagoryEntity;
	
	@OneToOne
	@JoinColumn(name="fk_admin_id")
	private AdminEntity adminEntity;
	
	@Column(name="banner_name")
	private String bannerName;
	
	@Column(name="reward_amt")
	private Double rewardAmt;
	
	@Column(name="desc")
	private String desc;
	
	@Column(name="bottom_txt")
	private String bottomTxt;
	
	@Column(name="points")
	private String points;
	
	@Column(name="icon_image")
	private String iconImage;
	
	@Column(name="bnr_image")
	private String bnrImage;
	
	@Column(name="app_url")
	private String appUrl;
	
	@Column(name="offer_name")
	private String offerName;
	
	@Column(name="discount_price")
	private Double discountPrice;
	
	@Column(name="is_publish")
	private Boolean isPublish;
	
	@Column(name="is_term_cond")
	private Boolean isTermCond;
	
	@Column(name="term_condition")
	private String termCondition;
	
	@Column(name="is_active")
	private Boolean isActive=true;
	
	
	

}
