package com.example.demo.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRespository;

//    @Autowired
//    public EmployeeService(EmployeeRepository employeeRespository) {
//        this.employeeRespository = employeeRespository;
//    }


    public List<Employee> listAll() {
        List<Employee> employees = 
                employeeRespository.findAll();
        
        if(employees == null) {
            throw new EmployeeNotFoundException();
        }
        
        // TODO: Normal flow
        return employees;
    }

    // For test only
    public void setRepository(EmployeeRepository employeeRepository) {
        this.employeeRespository = employeeRepository;
    }

}
