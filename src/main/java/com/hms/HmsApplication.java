package com.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.hms.address", "com.hms.appointment", "com.hms.department", "com.hms.doctor", "com.hms.history", "com.hms.nurse", "com.hms.patient", "com.hms.payment"})
public class HmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HmsApplication.class, args);
	}

}
