package com.mikhail.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee1")
public class MyController1 {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Ivanov");
//        emp.setSalary(120);

        model.addAttribute("employee", emp);

        return "ask-emp-details1-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(
            @Valid @ModelAttribute("employee") Employee emp,
            BindingResult bindingResult
    ) {

//        // можно изменять полученные значение перед выводом в view
//        emp.setName("Mr. " + emp.getName());
//        emp.setSurname(emp.getSurname() + "!");
//        emp.setSalary(emp.getSalary()*10);

        if (bindingResult.hasErrors()) {
            return "ask-emp-details1-view";
        } else {
            return "show-emp-details1-view";
        }
    }
}
