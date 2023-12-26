package com.example.hw8.service;

import com.example.hw8.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> getAll();

    public void save(Emp employee);

    public Emp getEmployee(int id);

    public void delete(int id);
}
