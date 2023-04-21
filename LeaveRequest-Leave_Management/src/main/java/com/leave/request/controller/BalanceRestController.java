package com.leave.request.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leave.request.entity.LeaveBalance;
import com.leave.request.service.ILeaveBalanceService;


@RestController
@RequestMapping("/balance")
public class BalanceRestController {
	
	@Autowired
	ILeaveBalanceService service;
	
	@PostMapping("/update")
	public LeaveBalance updateBal(@RequestBody LeaveBalance balDTO) {
		return service.updateBalByempid(balDTO);
	}
	
	@GetMapping("/get/balance/{id}")
	public LeaveBalance getbyid(@PathVariable long id) {
		return service.getbyid(id);
	}
		
	
	@GetMapping("/employee/balance/{employeeId}")
	public List<LeaveBalance> getByEmpId(@PathVariable long employeeId){
		return service.getByEmpId(employeeId);
	}

}
