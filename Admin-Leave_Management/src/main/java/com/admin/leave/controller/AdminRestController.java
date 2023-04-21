package com.admin.leave.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.leave.DTO.AdminDTO;
import com.admin.leave.entity.Admin;
import com.admin.leave.entity.Employee;
import com.admin.leave.service.IAdminService;
import com.admin.leave.vo.EmpReq;
import com.admin.leave.vo.LeaveBalance;
import com.admin.leave.vo.LeaveRequest;

@RestController
@RequestMapping("/admin")
public class AdminRestController {
	
	@Autowired
	IAdminService service;
	
	@PostMapping("/addDetails")
	public Admin add(@Valid @RequestBody AdminDTO adminDTO) {
		return service.add(adminDTO);
	}
	
	@GetMapping("/getById/{id}")
	public Admin getAdminById(@PathVariable long id) {
		return service.getAdminById(id);
	}
	
	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<String> deletebyid(@PathVariable long id){
		service.deletebyid(id);
		return new ResponseEntity<String>("Record deleted",HttpStatus.OK);
	}
	
	@PutMapping("/update/leaveStatus")
	public LeaveRequest updateLeaveRequest(@Valid @RequestBody LeaveRequest req) {
		return service.updateLeaveRequest(req);
	}
	@GetMapping("/getEmployee/{employeeId}")
	public Employee getEmployeeById(@PathVariable long employeeId) {
		return service.getEmployeeById(employeeId);
	}
	
	@GetMapping("/get/PendingRequest/{employeeId}")
	public EmpReq getLeaveRequest(@PathVariable long employeeId){
		return service.getLeaveRequest(employeeId);
		
	}
	@PutMapping("/update/balance")
	public LeaveBalance updateLeaveBalance(@RequestBody LeaveBalance bal) {
		return service.updateLeaveBalance(bal);
	}
}
