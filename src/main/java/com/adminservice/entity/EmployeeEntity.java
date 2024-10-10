package com.adminservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="op_emp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity extends BaseEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="emp_id")
	private Long empId;
	
	@OneToOne
	@JoinColumn(name="fk_admin_id")
	private AdminEntity adminEntity;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_father_name")
	private String empFatherName;
	
	@Column(name="mob_no")
	private String mobNo;
	
	@Column(name="email_id")
	private String emailId;
	
	@Column(name="address")
	private String address;
	
	@Column(name="pan_no")
	private String panNo;
	
	@Column(name="ac_no")
	private String acNo;
	
	@Column(name="ifsc_code")
	private String ifscCode;
	
	@Column(name="emp_code")
	private String empCode;
	
	@Column(name="emp_position")
	private String empPosition;
	
	@Column(name="team_lead")
	private String teamLead;
	
	@Column(name="doj")
	private String doj;
	
	@Column(name="is_active")
	private Boolean isActive=true;
}
