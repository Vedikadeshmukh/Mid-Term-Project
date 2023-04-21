package com.leave.request.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.leave.request.entity.LeaveRequest;
import com.leave.request.util.LeaveStatus;
import com.leave.request.util.LeaveType;

public interface LeaveRequestRepository extends JpaRepository<LeaveRequest,Long>{
	
	List<LeaveRequest> findByEmployeeId(long employeeId);
	
	List<LeaveRequest> findByEmployeeIdAndStatus(long employeeId,LeaveStatus status);
	
	List<LeaveRequest> findByEmployeeIdAndLeaveType(long employeeId,LeaveType leavetype);
	

}
