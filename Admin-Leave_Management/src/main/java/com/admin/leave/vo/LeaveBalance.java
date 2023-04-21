package com.admin.leave.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class LeaveBalance {

	private long leaveBalanceId;
	private long employeeId;
	
	
	private  String leaveType;
	
	private long balance;
}
