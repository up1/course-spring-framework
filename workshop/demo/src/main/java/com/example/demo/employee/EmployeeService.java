package com.example.demo.employee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exception.InvalidDividedByZeroException;

@Service
public class EmployeeService {

    public List<Employee> listAll() {
        throw new InvalidDividedByZeroException();
    }

}
