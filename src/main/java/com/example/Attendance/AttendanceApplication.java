package com.example.Attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan(basePackages={"<Staff>"})
//@EnableJpaRepositories(basePackages="<StaffRepository>")
//@EnableTransactionManagement
//@EntityScan(basePackages="<User>")
public class AttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceApplication.class, args);
	}

}
