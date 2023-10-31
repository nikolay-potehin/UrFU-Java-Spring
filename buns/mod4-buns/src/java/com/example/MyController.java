package java.com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
//@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showView() {
        return "first-view";
    }

    @RequestMapping("/details")
    public String getDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "details";
    }

    @RequestMapping("info")
    //public String showDetails(@RequestParam("name") String name, Model model) {
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult result) {
        //String name = request.getParameter("name");
        //name = "Ms. " + name;
        //model.addAttribute("name", name);
        if (result.hasErrors())
            return "details";
        return "show_info";
    }
}
