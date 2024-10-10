package com.adminservice.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
@Data
@MappedSuperclass
public class BaseEntity implements Serializable {

	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name="created_by")
	    private String createdBy;

	    @Column(name="created_date")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private String createdDate;

	    @Column(name="updated_by")
	    private String updatedBy;

	    @Column(name="updated_date")
	    @JsonFormat(pattern = "yyyy-MM-dd")
	    private String updatedDate;


@PrePersist
public void setInsertedDefault(){
     if(this.createdDate == null){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         sdf.setTimeZone(TimeZone.getTimeZone("IST"));
         String username = System.getProperty("user.name");
        this.createdDate = sdf.format(new java.sql.Date(new Date().getTime()));
       this.createdBy = username;
     }
 }
 @PreUpdate
 public void setUpdatedDefault(){
     if(this.updatedDate == null){
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         sdf.setTimeZone(TimeZone.getTimeZone("IST"));
         String username = System.getProperty("user.name");
         this.updatedDate = sdf.format(new java.sql.Date(new Date().getTime()));
         this.updatedBy = username;
     }
 }


}
