package org.example;

import org.example.config.Config;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        System.out.println(communication.getAllEmployees());
        Employee employee = communication.getEmployeeById(1);
        System.out.println(employee);
        //employee.setDepartment("New Dep");
        //employee.setId(1);
        //communication.saveEmployee(employee);
        //communication.deleteEmployee(employee.getId());
    }
}
