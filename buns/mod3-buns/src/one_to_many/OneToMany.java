package one_to_many;

import one_to_many.entity.Department;
import one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class OneToMany {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            //Employee employee = new Employee("test", "test", 500);
            //Employee employee1 = new Employee("test1", "test1", 500);
            //Employee employee2 = new Employee("test2", "test2", 500);
            //Department department = new Department("test_dep", 100, 1000);
            //department.addEmployee(employee);
            //department.addEmployee(employee2);
            //department.addEmployee(employee1);
            session.beginTransaction();
            //session.persist(department);
            List<Department> list = session.createQuery("from Department").getResultList();
            list.stream().forEach(e -> System.out.println(e.getEmployeeList()));
            session.getTransaction().commit();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
