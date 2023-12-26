package com.example.hw8.service;

import com.example.hw8.dao.DAO;
import com.example.hw8.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private DAO employeeDAO;

    @Override
    @Transactional
    public List<Emp> getAll() {
        return employeeDAO.getAll();
    }

    @Override
    @Transactional
    public void save(Emp employee) {
        employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Emp getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        employeeDAO.delete(id);
    }
}
