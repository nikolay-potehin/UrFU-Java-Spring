package java.org.example.controller;

import java.org.example.dao.EmployeeDAO;
import java.org.example.entity.Employee;
import java.org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    @Autowired
    private EmployeeService service;

    @RequestMapping("/")
    public String showAllEmployees(Model model){
        List<Employee> all = service.getAll();
        model.addAttribute("all", all);
        return "all_employees";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "add_info";
    }

    @RequestMapping("/save")
    public String save(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
        if (result.hasErrors())
            return "add_info";
        service.save(employee);
        return "redirect:/";
    }

    @RequestMapping("/update")
    public String update(@RequestParam("empId") int id, Model model) {
        Employee employee = service.getEmployee(id);
        model.addAttribute("employee", employee);
        return "add_info";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("empId") int id, Model model) {
        service.delete(id);
        return "redirect:/";
    }
}
