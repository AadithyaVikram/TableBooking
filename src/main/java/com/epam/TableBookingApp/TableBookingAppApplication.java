package com.epam.TableBookingApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class TableBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TableBookingAppApplication.class, args);
		System.out.println("Application Started");
	}

}
