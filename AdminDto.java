package com.testyantra.union.customerdto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "union_admin")
public class AdminDto {
	@Id
	private String empId;
	private String empName;
	private String password;
	private Long mobileNo;
}
