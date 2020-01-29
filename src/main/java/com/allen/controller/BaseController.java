package com.allen.controller;

import com.allen.data.EmployeeRepository;
import com.allen.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class BaseController {

    @Autowired
    private EmployeeRepository employeeRepository;


    @RequestMapping("/api/employees/all")
    public @ResponseBody List<Employee> getEmployee() {
        return employeeRepository.getEmployees();
    }


    @RequestMapping("/")
    public String baseRoute() {
        return "index";
    }
}