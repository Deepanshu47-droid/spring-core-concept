package com.springcoreconcepts.springbasics.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class EmployeeBean {
    private String empName;

    @Autowired
    private DepartmentBean department;

    // Default constructor
    public EmployeeBean() {}

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + department.getDeptName());
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public DepartmentBean getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentBean department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee details are given below.......<br> " +
                "empName = '" + empName + "<br>" +
                "department = " + department.getDeptName();
    }
}

