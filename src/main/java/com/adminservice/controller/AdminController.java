package com.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adminservice.entity.AdminEntity;
import com.adminservice.service.AdminService;
@RestController
@RequestMapping("/api/admin")
@CrossOrigin
public class AdminController {
	 @Autowired
	    private AdminService adminService;

	    @PostMapping("/register")
	    public ResponseEntity<AdminEntity> registerAdmin(@RequestBody AdminEntity adminEntity) {
	        AdminEntity registeredAdmin = adminService.registerAdmin(adminEntity);
	        return new ResponseEntity<>(registeredAdmin, HttpStatus.CREATED);
	    }
	    @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestParam String username, @RequestParam String password) {
	        AdminEntity adminEntity = adminService.login(username, password);

	        if (adminEntity != null) {
	            // Successful login
	            return new ResponseEntity<>("Login successful. Welcome, " + adminEntity.getAdminName(), HttpStatus.OK);
	        } else {
	            // Invalid credentials
	            return new ResponseEntity<>("Invalid username or password", HttpStatus.UNAUTHORIZED);
	        }
	    }

}
