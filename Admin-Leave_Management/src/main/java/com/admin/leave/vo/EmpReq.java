package com.admin.leave.vo;

import com.admin.leave.entity.Employee;

public class EmpReq {
	
	private Employee emp;
	private LeaveRequest[] req;
	public EmpReq() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpReq(Employee emp, LeaveRequest[] req) {
		super();
		this.emp = emp;
		this.req = req;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public LeaveRequest[] getReq() {
		return req;
	}
	public void setReq(LeaveRequest[] req) {
		this.req = req;
	}
	

}
