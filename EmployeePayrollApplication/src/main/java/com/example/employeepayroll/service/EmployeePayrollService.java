package com.example.employeepayroll.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Service;

import com.example.employeepayroll.dto.EmployeePayrollDTO;
import com.example.employeepayroll.model.EmployeePayrollData;

@Service
public class EmployeePayrollService implements IEmployeePayrollService {

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();
    public List<EmployeePayrollData> getEmployeePayrollData() {
        return employeePayrollList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollList.get(empId-1);
    }

    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(1, empPayrollDTO);
        employeePayrollList.add(empData);
        return empData;
    }


    public EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = this.getEmployeePayrollDataById(empId);
        employeePayrollList.set(empId-1,empData);
        return empData;
    }


    public void deleteEmployeePayrolldata(int empId){
        employeePayrollList.remove(empId-1);
    }
}
