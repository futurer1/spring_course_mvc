package com.mikhail.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails() {
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(HttpServletRequest request, Model model) {

        String empName = request.getParameter("employeeName");
        empName = String.format("Mr. %s", empName);

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " - some description");

        return "show-emp-details-view";
    }

    @RequestMapping("/showDetails1")
    public String showEmpDetails1(
            @RequestParam("employeeName") String empName,
            Model model
    ) {
        empName = String.format("Mr. %s", empName);

        model.addAttribute("nameAttribute", empName);
        model.addAttribute("description", " showDetails1 some description");

        return "show-emp-details-view";
    }
}
