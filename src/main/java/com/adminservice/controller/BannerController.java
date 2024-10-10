package com.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.adminservice.dto.BannerDTO;
import com.adminservice.dto.ResponseData;
import com.adminservice.service.BannerService;

@RestController
@RequestMapping("/api/banner")
@CrossOrigin
public class BannerController {

	@Autowired
    private BannerService bannerService;

    @PostMapping("/saveBanner")
    public ResponseEntity<ResponseData<BannerDTO>> createBanner(@RequestBody BannerDTO bannerDTO) {
    	try {
    		BannerDTO createdBanner = bannerService.createBanner(bannerDTO);
        return ResponseEntity.ok(new ResponseData<>(200, "Banner added successfully", createdBanner));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
					.body(new ResponseData<>(500, "Failed To Add Banner", null));

		}
    }
}
