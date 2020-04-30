package com.vivek.employee.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vivek.employee.model.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employees")
	public List<Employee> getEmployess(){
		return Arrays.asList(new Employee(1,"Vivek",500),new Employee(2,"Raj",500),new Employee(3,"Mukesh",500));
	}
	
	@GetMapping("/employees/sal")
	public List<Employee> getEmployessSalary(){
		RestTemplate rt=new RestTemplate();
		return (List<Employee>)rt.getForEntity("http://salary:9090/salary", List.class).getBody();
	}

}
