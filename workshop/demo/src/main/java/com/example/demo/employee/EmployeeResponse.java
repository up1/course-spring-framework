package com.example.demo.employee;

import java.util.List;
 
public class EmployeeResponse {
    
    private int code; 
    private String message;
    private List<Employee> employees;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<Employee> getEmployees() {
        return employees;
    }
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

}
