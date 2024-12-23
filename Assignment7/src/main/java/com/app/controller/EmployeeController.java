package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController // =@Controller class level  + @ResponseBody : 
//added implicitly on rety type of all req handling methods
@RequestMapping("/employees/")
@CrossOrigin( origins = "http://localhost:3000")
public class EmployeeController {
	//dependency
	@Autowired
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in the employee controller");
	}
	
	//get all employees
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees(){
		return empService.getAllEmps();
	}
	
	//add new employee
	@PostMapping("/addNewEmp")
	public Employee addNewEmp(@RequestBody Employee employee) {
		System.out.println("in add new emp"+employee);
		return empService.addNewEmp(employee);
	}
	
	//get employee by id 
	@GetMapping("/{pId}")
	public Employee getEmpById(@PathVariable Long pId) {
		System.out.println("in get emp by id"+pId);
		return empService.getEmpDetails(pId);
	}
	
	//update Employee details
	@PutMapping("/update")
	public Employee updateEmpDetails(@RequestBody Employee employee) {
		System.out.println("in the update emp");
		return empService.updateEmp(employee);
		
	}
	
	@DeleteMapping("/delete")
	public String deleteById(Long id) {
		System.out.println("in the delete by id");
		return empService.deleteEmp(id);
	}
	
}
