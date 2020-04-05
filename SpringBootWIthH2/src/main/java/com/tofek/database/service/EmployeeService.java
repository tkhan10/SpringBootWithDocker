/**
 * 
 */
package com.tofek.database.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tofek.database.model.Employee;
import com.tofek.database.repository.EmployeeRepository;

/**
 * @author tofekkhan
 *
 */
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees()
    {
        List<Employee> employeeList = employeeRepository.findAll();
         
        if(employeeList.size() > 0) {
            return employeeList;
        } else {
            return new ArrayList<Employee>();
        }
    }
	
	public Employee getEmployeeById(Long id) throws Exception {

		Optional<Employee> employee = employeeRepository.findById(id);
        
		if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new Exception("No employee record exist for given id");
        }
		
	}
	
	public Employee createOrUpdateEmployee(Employee entity) throws Exception 
    {
		
		
		Optional<Employee> employee = employeeRepository.findById(entity.getId());
         
        if(employee.isPresent()) 
        {
            Employee newEntity = employee.get();
            newEntity.setEmail(entity.getEmail());
            newEntity.setFirstName(entity.getFirstName());
            newEntity.setLastName(entity.getLastName());
 
            newEntity = employeeRepository.save(newEntity);
             
            return newEntity;
        } else {
            entity = employeeRepository.save(entity);
             
            return entity;
        } 
    } 
     
    public void deleteEmployeeById(Long id) throws Exception 
    {
        Optional<Employee> employee = employeeRepository.findById(id);
         
        if(employee.isPresent()) 
        {
        	employeeRepository.deleteById(id);
        } else {
            throw new Exception("No employee record exist for given id");
        }
    } 

}
