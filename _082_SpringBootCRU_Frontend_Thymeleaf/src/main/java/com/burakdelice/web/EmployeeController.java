package com.burakdelice.web;

import com.burakdelice.model.Employee;
import com.burakdelice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/","/list"})
    public String getAllEmployees(Model model){
        List<Employee> listEmployees = employeeService.getAllEmployees();
        model.addAttribute("listEmployees",listEmployees);
        return "list-employees";
    }

    @GetMapping("/add")
    public String getAddEmployee(Model model){
        return "add-employees";
    }
}
