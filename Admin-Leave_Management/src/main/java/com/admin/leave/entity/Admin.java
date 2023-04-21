package com.admin.leave.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


@Entity
@Table(name="Admin")
public class Admin {
	
	@Id
	private long adminId;
	
	@NotNull
	private String adminName;
	
	@NotNull
	private String email;
	
	@NotNull
	private String phoneNumber;
	private String department;
	
	

}
