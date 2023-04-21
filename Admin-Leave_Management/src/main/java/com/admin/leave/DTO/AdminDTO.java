package com.admin.leave.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class AdminDTO {
	
	private long adminId;
	private String adminName;
	private String email;
	private String phoneNumber;
	private String department;
	

}
