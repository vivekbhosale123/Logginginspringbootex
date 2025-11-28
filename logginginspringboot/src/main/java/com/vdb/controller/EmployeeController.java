package com.vdb.controller;

import com.vdb.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    List<Employee> employeeList=new ArrayList<>();

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee)
    {
        log.info("####### Trying to add employee : {}", employee.getEmpName());
        log.debug("added addEmployee method in api layer");
        log.error("error log");
        log.trace("error log in add employee at line no 33");
        log.warn("warning logs");
        employeeList.add(employee);
        return new  ResponseEntity<>(employee, HttpStatus.CREATED);
    }

    @GetMapping("/findall")
    public ResponseEntity<List<Employee>> findAll()
    {
        return ResponseEntity.ok(employeeList);
    }

}
