/**
 * 
 */
package com.tofek.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tofek.database.model.Employee;
import com.tofek.database.service.EmployeeService;

/**
 * @author tofekkhan
 *
 */

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employerService; 
	
	@GetMapping
	public ResponseEntity<List<Employee>> getEmployeeEntity(){
		System.out.println("Starting....");
		
		List<Employee> list = employerService.getAllEmployees();
		
		return new ResponseEntity<List<Employee>>(list, new HttpHeaders(), HttpStatus.OK);
		
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) 
                                                    throws Exception {
		Employee entity = employerService.getEmployeeById(id);
 
        return new ResponseEntity<Employee>(entity, new HttpHeaders(), HttpStatus.OK);
    }
 
	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Employee> createOrUpdateEmployee(Employee employee)
                                                    throws Exception {
    	System.out.println("Post Mapping Method----");
    	Employee updated = employerService.createOrUpdateEmployee(employee);
        return new ResponseEntity<Employee>(updated, new HttpHeaders(), HttpStatus.OK);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) 
                                                    throws Exception {
    	employerService.deleteEmployeeById(id);
        return HttpStatus.FORBIDDEN;
    }
	

}
