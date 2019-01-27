package com.example.demo.case01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hello {

    @Autowired
    private DependencyClass1 dependencyClass1;

    @Autowired
    private ITask task;

    public String sayHi(String name) {
        return "Hi " + dependencyClass1.getData();
    }

    public String sayHiWithTask(String name) {
        return "Hi " + task.getData();
    }

}



