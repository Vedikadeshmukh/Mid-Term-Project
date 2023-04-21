package com.admin.leave.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.leave.service.IEmployeeService;
import com.admin.leave.vo.EmpBal;

@RestController
@RequestMapping("/Report")
public class ReportController {
	
	@Autowired
	IEmployeeService service;
	
	@GetMapping("/getby/employee/{employeeId}")
	public EmpBal getByEmpId(@PathVariable long employeeId) {
		return service.getByEmpId(employeeId);
	}

}
