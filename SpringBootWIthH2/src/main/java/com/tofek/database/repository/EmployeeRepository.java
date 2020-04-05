/**
 * 
 */
package com.tofek.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tofek.database.model.Employee;

/**
 * @author tofekkhan
 *
 */
public interface EmployeeRepository 
		extends JpaRepository<Employee, Long> {


}

