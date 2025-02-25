package com.example.employeepayroll.controller;

import com.example.employeepayroll.dto.ResponseDTO;
import com.example.employeepayroll.model.EmployeePayrollData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.employeepayroll.dto.EmployeePayrollDTO;

@RestController
@RequestMapping("/employeeservice")
public class EmployeePayrollController {

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData("Sahil",9999999,212);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success",empData);
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.OK);
    }

    @GetMapping("/get/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData("Sahi",35552545,27);
        ResponseDTO responseDTO = new ResponseDTO("Get Call Success by id: ",empData);
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(employeePayrollDTO.name,employeePayrollDTO.salary,142);
        ResponseDTO responseDTO = new ResponseDTO("Create Employee Payroll Data for: ",empData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@RequestBody EmployeePayrollDTO employeePayrollDTO) {
        EmployeePayrollData empData = new EmployeePayrollData(employeePayrollDTO.name, employeePayrollDTO.salary, 213);
        ResponseDTO responseDTO = new ResponseDTO("Update Success: ",empData);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empID) {
        ResponseDTO responseDTO = new ResponseDTO("Delete Success: ","Deleted"+empID);
        return new ResponseEntity<>(responseDTO,HttpStatus.OK);
    }

}
