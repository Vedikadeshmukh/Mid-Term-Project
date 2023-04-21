package com.admin.leave.vo;

import com.admin.leave.entity.Employee;

public class EmpBal {
	
	
	private Employee emp;
	private LeaveBalance[] bal;
	public EmpBal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpBal(Employee emp, LeaveBalance[] bal) {
		super();
		this.emp = emp;
		this.bal = bal;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public LeaveBalance[] getBal() {
		return bal;
	}
	public void setBal(LeaveBalance[] bal) {
		this.bal = bal;
	}
	
	
}
