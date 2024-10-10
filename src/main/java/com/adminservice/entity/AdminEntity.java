package com.adminservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="op_admin_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdminEntity extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private Long adminId;
	
	@Column(name="admin_name")
	private String adminName;
	
	@Column(name="admin_email")
	private String adminEmail;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mob_no")
	private String mobNo;
	
	@Column(name="is_active")
	private Boolean isActive=true;
	

}
