package com.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adminservice.entity.AdminEntity;

public interface AdminRepo extends JpaRepository<AdminEntity,Long>{
	AdminEntity findByUsername(String username);

}
