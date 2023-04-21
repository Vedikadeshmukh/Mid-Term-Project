package com.leave.request.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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


@Entity
@Table(name="Leave_Request")
public class LeaveRequest {
	
	@Id
	@NotNull
	private long leaveRequestId;
	
	@NotNull
	private long employeeId;
	
	@NotNull
	private Date startDate;
	@NotNull
	private Date endDate;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private LeaveType leaveType;

	private String reason;
	
	
	@Enumerated(EnumType.STRING)
    private LeaveStatus status;
	
	private String comment;

	


}
