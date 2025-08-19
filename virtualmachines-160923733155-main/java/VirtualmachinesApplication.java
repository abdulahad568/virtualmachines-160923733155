package com._160923733155.virtualmachines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Virtual Machines Management Application
 * 
 * @author abdul ahad
 * @studentId 160923733155
 * @version 1.0
 * @since 2024
 */
@SpringBootApplication
public class VirtualmachinesApplication {

	public static void main(String[] args) {
		System.out.println("Starting Virtual Machines Management System...");
		System.out.println("Author: abdul ahad");
		System.out.println("Student ID: 160923733155");
		SpringApplication.run(VirtualmachinesApplication.class, args);
	}

}