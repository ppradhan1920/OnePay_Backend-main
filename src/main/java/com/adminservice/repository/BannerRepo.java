package com.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminservice.entity.BannerEntity;

public interface BannerRepo extends JpaRepository<BannerEntity, Long>{

}
