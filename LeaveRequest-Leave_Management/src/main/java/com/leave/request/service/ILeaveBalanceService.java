package com.leave.request.service;

import java.util.List;

import com.leave.request.DTO.LeaveBalanceDTO;
import com.leave.request.entity.LeaveBalance;
import com.leave.request.entity.LeaveRequest;
import com.leave.request.util.LeaveType;

public interface ILeaveBalanceService {
	
	public LeaveBalance getbyid(long id);
	
	public LeaveBalance updateBalByempid(LeaveBalance balDTO);
	
	public List<LeaveBalance> getByEmpId(long employeeId);
	
	public List<LeaveBalance>  getbyEmpIdAndLeaveType(long employeeId,LeaveType leavetype);
	
	
	
}
