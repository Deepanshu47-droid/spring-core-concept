package com.springcoreconcepts.springbasics.bean;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT Department";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
