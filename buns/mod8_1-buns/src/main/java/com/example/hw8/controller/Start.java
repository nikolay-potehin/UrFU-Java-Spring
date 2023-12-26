package com.example.hw8.controller;

import com.example.hw8.entity.Emp;
//import com.example.hw8.error.NoSuchEmployeeException;
import com.example.hw8.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Start {

    @Autowired
    private EmpService service;

    @GetMapping("/employees")
    public List<Emp> showAllEmployees() {
        return service.getAll();
    }

    @GetMapping("/employees/{id}")
    public Emp getEmployeeById(@PathVariable int id) {
        Emp employee = service.getEmployee(id);
        return service.getEmployee(id);
    }

    @PostMapping("/employees")
    public Emp addEmployee(@RequestBody Emp employee) {
        service.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    public Emp updateEmployee(@RequestBody Emp employee) {
        service.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Emp employee = service.getEmployee(id);
        service.delete(id);
        return "Employee with id - " + id + " was deleted";
    }
}
