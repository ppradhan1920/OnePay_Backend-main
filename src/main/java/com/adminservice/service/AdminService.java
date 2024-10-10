package com.adminservice.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adminservice.entity.AdminEntity;
import com.adminservice.repository.AdminRepo;

@Service
public class AdminService {
	@Autowired
	private AdminRepo adminRepo;
	
	 @Autowired
	    private EmailService emailService;
	 
	 public AdminEntity registerAdmin(AdminEntity adminEntity) {
	        // Generate a unique username
	        String username = "admin-" + UUID.randomUUID().toString().substring(0, 8);
	        adminEntity.setUsername(username);

	        // Save the admin details in the database
	        AdminEntity savedAdmin = adminRepo.save(adminEntity);

	        // Send username to the admin's email
	        String emailContent = "Dear " + adminEntity.getAdminName() + ",\n\n" +
	                "Your registration is successful. Here is your username: " + username +
	                "\n\nPlease use this username along with your password to log in.";

	        emailService.sendEmail(adminEntity.getAdminEmail(), "Registration Successful", emailContent);

	        return savedAdmin;
	    }
	 public AdminEntity login(String username, String password) {
	        // Find the admin by username
	        AdminEntity adminEntity = adminRepo.findByUsername(username);

	        if (adminEntity != null && adminEntity.getPassword().equals(password)) {
	            // Password matches, return the admin entity
	            return adminEntity;
	        } else {
	            // Username not found or password doesn't match
	            return null;
	        }
	    }

}
