package com.mrt.microservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mrt.microservice.model.Employee;
@RestController
public class EmployeeController {
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("Mritunjay Prasad Singh");
		emp.setDesignation("Lead Eng");
		emp.setEmpId("1");
		emp.setSalary(160000);
		return emp;
	}
}
