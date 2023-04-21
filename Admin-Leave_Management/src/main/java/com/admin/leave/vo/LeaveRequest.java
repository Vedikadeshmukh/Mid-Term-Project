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

public class LeaveRequest {

	
	private long leaveRequestId;
	private long employeeId;
	private Date startDate;
	private Date endDate;
	private String leaveType;
	private String reason;
	private String status;
	private String comment;
	
}
