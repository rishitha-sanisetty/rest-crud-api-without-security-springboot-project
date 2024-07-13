package com.springboot.rest.api.repository;

import com.springboot.rest.api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
