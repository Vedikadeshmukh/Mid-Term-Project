package com.leave.request.service;

import java.util.List;


import com.leave.request.DTO.LeaveRequestDTO;
import com.leave.request.entity.LeaveRequest;
import com.leave.request.util.LeaveStatus;
import com.leave.request.util.LeaveType;

public interface ILeaveRequestService {
	
	
	public LeaveRequest addRequest(LeaveRequestDTO reqDTO);
	
	
	public void deletereq(long id);
	
	public  LeaveRequest getReqById(long id);

	public LeaveRequest updateStatus(LeaveRequestDTO reqDTO);

	public List<LeaveRequest> getbyEmployeeId(long employeeId);
	
	public List<LeaveRequest> getbyEmpIdAndStatus(long employeeId,LeaveStatus status);
	
	public List<LeaveRequest> getbyEmpIdAndLeaveType(long employeeId,LeaveType leavetype);

	


}
