package com.example.demo.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    //GET /employee  => List all employee
    //GET /employee/id  => Employee info by id
    
    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("/employee")
    public EmployeeResponse listEmployee() {
        // Request
        // Process :: Validation
        // Delegate :: Call service
        List<Employee> employees =
                employeeService.listAll();
        // Response
        EmployeeResponse response =  
                new EmployeeResponse();
        response.setCode(200);
        response.setEmployees(employees);
        return response;
    }
    
}
