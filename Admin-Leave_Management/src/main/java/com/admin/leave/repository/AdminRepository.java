package com.admin.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.leave.entity.Admin;


public interface AdminRepository extends JpaRepository<Admin,Long>{
	
}
