package java.org.example.dao;

import java.org.example.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAll();

    public void save(Employee employee);

    public Employee getEmployee(int id);

    public void delete(int id);
}
