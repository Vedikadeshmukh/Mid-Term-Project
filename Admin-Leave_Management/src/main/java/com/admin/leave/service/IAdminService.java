package com.admin.leave.service;

import com.admin.leave.DTO.AdminDTO;

import com.admin.leave.entity.Admin;
import com.admin.leave.entity.Employee;
import com.admin.leave.vo.EmpReq;
import com.admin.leave.vo.LeaveBalance;
import com.admin.leave.vo.LeaveRequest;


public interface IAdminService {
	
	
	public Admin add(AdminDTO adminDTO);
	
	public Admin getAdminById(long id);

	
	public void deletebyid(long id);
	public Employee getEmployeeById(long employeeId);
	public EmpReq getLeaveRequest(long employeeId);
	public LeaveRequest updateLeaveRequest(LeaveRequest req);
	public LeaveBalance updateLeaveBalance(LeaveBalance bal);

}
