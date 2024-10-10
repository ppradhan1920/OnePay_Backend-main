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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="op_catagory")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CatagoryEntity extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="catagory_id")
	private Long catagoryId;
	
	@OneToOne
	@JoinColumn(name="catagory_id")
	private AdminEntity adminEntity;
	
	@Column(name="catagory_name")
	private String catagoryName;
	
	@Column(name="is_active")
	private Boolean isActive=true;
	
	
}
