package com.leave.request;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class LeaveRequestLeaveManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeaveRequestLeaveManagementApplication.class, args);
	}

}
