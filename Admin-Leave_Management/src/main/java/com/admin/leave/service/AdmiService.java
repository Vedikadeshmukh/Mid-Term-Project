package com.admin.leave.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.admin.leave.DTO.AdminDTO;
import com.admin.leave.entity.Admin;
import com.admin.leave.entity.Employee;

import com.admin.leave.repository.AdminRepository;
import com.admin.leave.vo.EmpBal;
import com.admin.leave.vo.EmpReq;
import com.admin.leave.vo.LeaveBalance;
import com.admin.leave.vo.LeaveRequest;

@Service
public class AdmiService implements IAdminService {

	
	@Autowired
	AdminRepository repo;
	
	@Autowired
	RestTemplate rest;
	
	@Autowired
	IEmployeeService service;
	
	@Override
	public Admin add(AdminDTO adminDTO) {
		// TODO Auto-generated method stub
		Admin ad = new Admin();
		ad.setAdminId(adminDTO.getAdminId());
		ad.setAdminName(adminDTO.getAdminName());
		ad.setEmail(adminDTO.getEmail());
		ad.setPhoneNumber(adminDTO.getPhoneNumber());
		ad.setDepartment(adminDTO.getDepartment());
		return repo.save(ad);
		
	}

	@Override
	public Admin getAdminById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void deletebyid(long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);

	}

	@Override
	public LeaveRequest updateLeaveRequest(LeaveRequest req) {
		// TODO Auto-generated method stub
		LeaveRequest request=rest.postForObject("http://localhost:9191/api/leave/leaveRequest/stauts", req, LeaveRequest.class);
		return request;

	}

	@Override
	public Employee getEmployeeById(long employeeId) {
		// TODO Auto-generated method stub
		return service.getEmpById(employeeId);
	}
	
	
	@Override
	public EmpReq getLeaveRequest(long employeeId) {
		// TODO Auto-generated method stub
		Employee emp=getEmployeeById(employeeId);
		long employeeid=emp.getEmployeeId();
		
		LeaveRequest[] req=rest.getForObject("http://localhost:9191/api/leave/get/employeewithpending/"+employeeid, LeaveRequest[].class);
		EmpReq leave=new EmpReq(emp,req); 
		return leave;
		
	}

	@Override
	public LeaveBalance updateLeaveBalance(LeaveBalance bal) {
		// TODO Auto-generated method stub
		LeaveBalance balance=rest.postForObject("http://localhost:9191/balance/update", bal, LeaveBalance.class);
		return balance;
	}

	
	
	

	



}
