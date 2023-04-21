package com.admin.leave.service;

import java.util.List;


import com.admin.leave.DTO.EmployeeDTO;
import com.admin.leave.entity.Employee;
import com.admin.leave.vo.EmpBal;
import com.admin.leave.vo.EmpReq;
import com.admin.leave.vo.LeaveRequest;




public interface IEmployeeService {
	
	
	public Employee add(EmployeeDTO empDTO);
	
	public Employee getEmpById(long id);

	
	public void deletebyid(long id);

	public Employee updateEmp(EmployeeDTO empDTO);
	
	public List<Employee> gaetAll();
	
	public LeaveRequest sendLeaveRequest(LeaveRequest req);


	public EmpBal getByEmpId(long employeeId);
	
	public EmpReq getLeaveRequestStatus(long employeeId);



}
