package com.example.hw8_1.service;

import com.example.hw8_1.dao.EmployeeRepository;
import com.example.hw8_1.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        //return employeeRepository.getReferenceById(id);
        //mployee employee = null;
        //Optional<Employee> optional = employeeRepository.findById(id);
        //if (optional.isPresent())
        //    employee = optional.get();
        //return employee;
        return employeeRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
