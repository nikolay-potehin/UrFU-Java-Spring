package org.example.service;

import org.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}
