package com.pxp.employeedatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pxp.employeedatabase.entity.EmployeeEntity;
import com.pxp.employeedatabase.model.Employee;
import com.pxp.employeedatabase.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "getallemployees", method = RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value = "addemployee", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.addEmployee(employee);
	}
	
	@RequestMapping(value = "updateemployee", method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(value = "deleteemployee", method = RequestMethod.DELETE)
	public String removeEmployee(@RequestBody EmployeeEntity employee) {
		return employeeService.removeEmployee(employee);
	}
}
