package com.leave.request.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.leave.request.util.LeaveType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


@Entity
@Table(name="Leave_Balance")
public class LeaveBalance {

	@Id
	@NotNull
	
	private long leaveBalanceId;
	
	@NotNull
	private long employeeId;
	
	@Enumerated(EnumType.STRING)
	private  LeaveType leaveType;
	
	private long balance;
	
	
	
}
