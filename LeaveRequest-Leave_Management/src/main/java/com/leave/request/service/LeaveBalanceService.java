package com.leave.request.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.request.entity.LeaveBalance;
import com.leave.request.repository.LeaveBalanceRepository;
import com.leave.request.repository.LeaveRequestRepository;
import com.leave.request.util.LeaveType;

@Service
public class LeaveBalanceService implements ILeaveBalanceService {

	

	@Autowired
	LeaveBalanceRepository repo;
	
	@Autowired
	LeaveRequestRepository  service;
	
	
	@Override
	public LeaveBalance getbyid(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public LeaveBalance updateBalByempid(LeaveBalance balDTO) {
		// TODO Auto-generated method stub
		LeaveBalance bal=new LeaveBalance();
				
		long balance=50;
		
		bal.setLeaveBalanceId(balDTO.getLeaveBalanceId());
		bal.setEmployeeId(balDTO.getEmployeeId());
		bal.setLeaveType(balDTO.getLeaveType());
		bal.setBalance(balance);
		return repo.save(bal);
		
			
	}

	@Override
	public List<LeaveBalance> getByEmpId(long employeeId) {
		// TODO Auto-generated method stub
		return repo.findByEmployeeId(employeeId);
	}

	@Override
	public List<LeaveBalance> getbyEmpIdAndLeaveType(long employeeId, LeaveType leavetype) {
		// TODO Auto-generated method stub
		return repo.findByEmployeeIdAndLeaveType(employeeId, leavetype);
	}

	
 

	
	



}
