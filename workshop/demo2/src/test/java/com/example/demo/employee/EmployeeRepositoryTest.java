package com.example.demo.employee;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@Transactional
@ContextConfiguration(classes = DBConfig.class)
public class EmployeeRepositoryTest {

    @Autowired
    private EmployeeRepository repository;

    @Test
    public void queriesCreation() {
        repository.findAll();
    }

}