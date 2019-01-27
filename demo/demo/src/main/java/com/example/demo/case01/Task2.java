package com.example.demo.case01;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Task2 implements ITask {
    @Override
    public int getData() {
        return 2;
    }
}
