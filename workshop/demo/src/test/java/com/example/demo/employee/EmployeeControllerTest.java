package com.example.demo.employee;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.exception.InvalidDividedByZeroException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = 
            WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {
    
    
    @Autowired
    private TestRestTemplate restTemplate;
    
    @MockBean
    private EmployeeService employeeService;
    
    @Test
    public void serviceShouldThrowException() {
        // Stub
        when(employeeService.listAll())
          .thenThrow(new InvalidDividedByZeroException());

        EmployeeResponse response = 
                restTemplate.getForObject("/employee", 
                      EmployeeResponse.class);
        
        assertEquals(401, response.getCode());
        
    }

    private List<Employee> mockData() {
        Employee e1 = new Employee(1, "name 1");
        Employee e2 = new Employee(2, "name 2");
        Employee e3 = new Employee(3, "name 3");
        List<Employee> employees = new ArrayList<>(); 
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        return employees;
    }
    
    @Test
    public void test() {
        // Stub
        when(employeeService.listAll())
          .thenReturn(mockData());
        
        EmployeeResponse response = 
                restTemplate.getForObject("/employee", 
                      EmployeeResponse.class);
        
        assertEquals(200, response.getCode());
        assertEquals(3, response.getEmployees().size());    
        
    }

}
