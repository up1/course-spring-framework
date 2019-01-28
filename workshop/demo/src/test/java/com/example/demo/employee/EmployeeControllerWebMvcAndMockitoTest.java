package com.example.demo.employee;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.HttpStatus;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.exception.InvalidDividedByZeroException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeControllerWebMvcAndMockitoTest {
    
    private MockMvc mvc;
    
    @Mock
    private EmployeeService employeeService;
    
    @InjectMocks
    private EmployeeController employeeController;
    
    private JacksonTester<EmployeeResponse> json;
    
    @Before
    public void init() {
        JacksonTester.initFields(this, new ObjectMapper());
        mvc = MockMvcBuilders.standaloneSetup(employeeController)
                .setControllerAdvice(new EmployeeControllerHandler())
                .build();
    }
  
    @Test
    public void shouldError() throws Exception {
        // Stub
        when(employeeService.listAll())
          .thenThrow(new InvalidDividedByZeroException());
        
        // Call controller
        MockHttpServletResponse response =
                mvc.perform(get("/employee"))
                   .andReturn().getResponse();
        
        assertEquals(HttpStatus.OK.value(), 
                response.getStatus());
        
        // Working with response
        EmployeeResponse employeeResponse =
                json.parseObject(response.getContentAsString());
        assertEquals(401, employeeResponse.getCode()); 
    }

}
