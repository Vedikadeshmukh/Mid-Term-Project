package com.leave.request.DTO;

import java.sql.Date;

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

public class LeaveRequestDTO {
	
	private long leaveRequestId;
	private Date startDate;
	private Date endDate;
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;
	private String reason;
	@Enumerated(EnumType.STRING)
	private LeaveStatus status;
	private String comment;
	private long employeeId;
	private long duration;

}
