package com.vivek.salary.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vivek.salary.model.Employee;

@RestController
public class SalaryController {
	
	@GetMapping("/salary")
	public List<Employee> getEmployess(){
		return Arrays.asList(new Employee(1,"Viveks",500),new Employee(2,"Rajs",500),new Employee(3,"Mukeshs",500));
	}

}
