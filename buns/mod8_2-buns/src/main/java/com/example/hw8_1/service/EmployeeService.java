package com.example.hw8_1.service;

import com.example.hw8_1.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);

    public List<Employee> findAllByName(String name);
}
