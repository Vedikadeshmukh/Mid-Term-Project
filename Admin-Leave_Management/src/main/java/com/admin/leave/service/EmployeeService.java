package com.admin.leave.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.admin.leave.DTO.EmployeeDTO;
import com.admin.leave.entity.Employee;

import com.admin.leave.repository.EmployeeRepository;
import com.admin.leave.vo.EmpBal;
import com.admin.leave.vo.EmpReq;
import com.admin.leave.vo.LeaveBalance;
import com.admin.leave.vo.LeaveRequest;



@Service
public class EmployeeService implements IEmployeeService {
	
	


	@Autowired
	EmployeeRepository repo;
	
	@Autowired
	RestTemplate rest;

	@Override
	public Employee add(EmployeeDTO empDTO) {
		
		Employee emp = new Employee();
		emp.setEmployeeId(empDTO.getEmployeeId());
		emp.setName(empDTO.getName());
		emp.setEmail(empDTO.getEmail());
		emp.setPhoneNumber(empDTO.getPhoneNumber());
		emp.setDepartment(empDTO.getDepartment());
		
		return repo.save(emp);
	}

	@Override
	public Employee getEmpById(long id){
		// TODO Auto-generated method stub
		return repo.findById(id).orElseThrow(null);
	}

	@Override
	public Employee updateEmp(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setEmployeeId(empDTO.getEmployeeId());
		emp1.setName(empDTO.getName());
		emp1.setEmail(empDTO.getEmail());
		emp1.setPhoneNumber(empDTO.getPhoneNumber());
		emp1.setDepartment(empDTO.getDepartment());
		
		
		return repo.save(emp1);
	}

	@Override
	public void deletebyid(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public List<Employee> gaetAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public LeaveRequest sendLeaveRequest(LeaveRequest req) {
		// TODO Auto-generated method stub
		LeaveRequest request=rest.postForObject("http://localhost:9191/api/leave/send/LeaveRequest", req, LeaveRequest.class);
		return request;
	}

	@Override
	public EmpBal getByEmpId(long employeeId) {
		// TODO Auto-generated method stub
		
		Employee emp = getEmpById(employeeId);
		long employeeid=emp.getEmployeeId();
		
		LeaveBalance[] balance=rest.getForObject("http://localhost:9191/balance/employee/balance/"+employeeid,LeaveBalance[].class);
		EmpBal empbal =  new EmpBal(emp,balance);
		return  empbal;
	}

	@Override
	public EmpReq getLeaveRequestStatus(long employeeId) {
		// TODO Auto-generated method stub
		Employee emp=getEmpById(employeeId);
		long employeeid=emp.getEmployeeId();
		
		LeaveRequest[] req=rest.getForObject("http://localhost:9191/api/leave/get/employee/"+employeeid, LeaveRequest[].class);
		EmpReq leave=new EmpReq(emp,req); 
		return leave;
		
	}
	
	
	

}
