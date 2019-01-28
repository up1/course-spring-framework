package com.example.demo.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.exception.InvalidDividedByZeroException;

@RestControllerAdvice
public class EmployeeControllerHandler {

    @ExceptionHandler(InvalidDividedByZeroException.class)
    public ResponseEntity<EmployeeResponse> xxx(
            InvalidDividedByZeroException e) {
        
        EmployeeResponse response = new EmployeeResponse();
        response.setCode(e.code);
        
        ResponseEntity<EmployeeResponse> result =
                new ResponseEntity<>(response, HttpStatus.OK);
        return result;
    }
    
}
