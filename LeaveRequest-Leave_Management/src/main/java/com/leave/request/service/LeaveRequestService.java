package com.leave.request.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leave.request.DTO.LeaveRequestDTO;
import com.leave.request.entity.LeaveBalance;
import com.leave.request.entity.LeaveRequest;
import com.leave.request.repository.LeaveRequestRepository;
import com.leave.request.util.LeaveStatus;
import com.leave.request.util.LeaveType;

@Service
public class LeaveRequestService implements ILeaveRequestService {
	
	@Autowired
	LeaveRequestRepository repo;

	
	@Override
	public LeaveRequest addRequest(LeaveRequestDTO reqDTO) {
		// TODO Auto-generated method stub
		
		LeaveRequest req= new LeaveRequest();
		req.setLeaveRequestId(reqDTO.getLeaveRequestId());
		req.setEmployeeId(reqDTO.getEmployeeId());
		req.setStartDate(reqDTO.getStartDate());
		req.setEndDate(reqDTO.getEndDate());
		req.setReason(reqDTO.getReason());
		req.setLeaveType(reqDTO.getLeaveType());

		req.setStatus(LeaveStatus.Pending);
		return repo.save(req);
	}

	@Override
	public void deletereq(long id) {
		repo.deleteById(id);
		
	}

	@Override
	public LeaveRequest getReqById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	

	@Override
	public LeaveRequest updateStatus(LeaveRequestDTO reqDTO) {
		// TODO Auto-generated method stub
		
		LeaveRequest req1= new LeaveRequest();
		
		req1.setLeaveRequestId(reqDTO.getLeaveRequestId());
		req1.setEmployeeId(reqDTO.getEmployeeId());
		req1.setStartDate(reqDTO.getStartDate());
		req1.setEndDate(reqDTO.getEndDate());
		req1.setReason(reqDTO.getReason());
		req1.setStatus(reqDTO.getStatus());
		req1.setLeaveType(reqDTO.getLeaveType());
		req1.setComment(reqDTO.getComment());
	
		return repo.save(req1);
	}

	
	@Override
	public List<LeaveRequest> getbyEmployeeId(long employeeId) {
		// TODO Auto-generated method stub
		
		return repo.findByEmployeeId(employeeId);
	}

	@Override
	public List<LeaveRequest> getbyEmpIdAndStatus(long employeeId, LeaveStatus status) {
		// TODO Auto-generated method stub
		
		return repo.findByEmployeeIdAndStatus(employeeId, status.Pending);
	}

	@Override
	public List<LeaveRequest> getbyEmpIdAndLeaveType(long employeeId, LeaveType leavetype) {
		// TODO Auto-generated method stub
		return repo.findByEmployeeIdAndLeaveType(employeeId, leavetype);
	}
	
	
		
	
}
