package com.leave.request.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.leave.request.entity.LeaveBalance;
import com.leave.request.util.LeaveType;

@Repository
public interface LeaveBalanceRepository extends JpaRepository<LeaveBalance,Long>{
	
	
	List<LeaveBalance> findByEmployeeId(long employeeId);
	List<LeaveBalance> findByEmployeeIdAndLeaveType(long employeeId,LeaveType leavetype);
	
	
}
