package com.springboot.rest.api.service;


import com.springboot.rest.api.entity.Employee;

public interface EmployeeService {

    Employee getEmployeeById(long id);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(Employee employee, long id);

    void deleteEmployee(long id);

}