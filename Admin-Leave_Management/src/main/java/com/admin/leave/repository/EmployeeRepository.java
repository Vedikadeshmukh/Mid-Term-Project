package com.admin.leave.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.leave.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
