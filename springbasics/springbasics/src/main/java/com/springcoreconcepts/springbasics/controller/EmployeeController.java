package com.springcoreconcepts.springbasics.controller;

import com.springcoreconcepts.springbasics.bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private ApplicationContext context; // Get beans dynamically

    private EmployeeBean employee; // Store latest employee details

    // ✅ POST API to accept user input
    @PostMapping("/add")
    public String addEmployee(@RequestBody EmployeeBean emp) {
        employee = context.getBean(EmployeeBean.class); // Get a new instance
        employee.setEmpName(emp.getEmpName());
        employee.setDepartment(emp.getDepartment());
        return "✅ Employee details added successfully!";
    }

    // ✅ GET API to retrieve stored details
    @GetMapping("/details")
    public String showEmployeeDetails() {
        return employee.toString();
    }
}
