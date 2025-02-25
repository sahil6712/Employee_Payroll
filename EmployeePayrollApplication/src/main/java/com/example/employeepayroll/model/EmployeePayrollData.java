package com.example.employeepayroll.model;

import com.example.employeepayroll.dto.EmployeePayrollDTO;

public class EmployeePayrollData {
    private String name;
    private long salary;
    private int employeeId;

    EmployeePayrollData() {

    }
    public EmployeePayrollData(String name, long salary, int employeeId) {
        this.name = name;
        this.salary = salary;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
