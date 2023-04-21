package com.leave.request.DTO;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.leave.request.util.LeaveStatus;
import com.leave.request.util.LeaveType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class LeaveBalanceDTO {
	
	private long leaveBalanceId;
	private long employeeId;
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
	private long balance;
	

}
