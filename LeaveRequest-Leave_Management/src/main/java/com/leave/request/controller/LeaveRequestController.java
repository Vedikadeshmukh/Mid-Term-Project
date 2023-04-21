package com.leave.request.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leave.request.DTO.LeaveRequestDTO;
import com.leave.request.entity.LeaveRequest;
import com.leave.request.service.ILeaveRequestService;
import com.leave.request.util.LeaveStatus;
import com.leave.request.util.LeaveType;

@RestController
@RequestMapping("/api/leave")
public class LeaveRequestController {
	
	@Autowired
	ILeaveRequestService service;

	
	@PostMapping("/send/LeaveRequest")
	public LeaveRequest addRequest(@Valid @RequestBody LeaveRequestDTO reqDTO) {
		return service.addRequest(reqDTO);
	}
	
	@DeleteMapping("/delete/Request/{id}")
	public ResponseEntity<String> deletereq(@PathVariable long id) {
		service.deletereq(id);
		return new ResponseEntity<String>("Request deleted",HttpStatus.OK);
	}
	
	
	@GetMapping("/get/leaveRequest/{id}")
	public  LeaveRequest getReqById(@PathVariable long id) {
		return service.getReqById(id);
	}
	
	@PostMapping("/leaveRequest/stauts")
	public LeaveRequest updateStatus(@Valid @RequestBody LeaveRequestDTO reqDTO){
		
		return service.updateStatus(reqDTO);
		
	}
	@GetMapping("/get/employee/{employeeId}")
	public List<LeaveRequest> getbyEmployeeId(@PathVariable long employeeId){
		return service.getbyEmployeeId(employeeId);
	}
	
	@GetMapping("/get/employeewithpending/{employeeId}")
	public List<LeaveRequest> getbyEmpIdAndStatus(@PathVariable long employeeId, LeaveStatus status){
		return service.getbyEmpIdAndStatus(employeeId, status.Pending);
		
	}
	@GetMapping("/get/employeewithpending/{leavetype}/{employeeId}")
	public List<LeaveRequest> getbyEmpIdAndLeaveType(@PathVariable long employeeId,@PathVariable  LeaveType leavetype){
		return service.getbyEmpIdAndLeaveType(employeeId, leavetype);
	}

}
