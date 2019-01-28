package com.example.demo.exception;

public class Calculator {

    public double divide(int i, int j) {
        // Validate input
        if(j <= 0) {
            throw new InvalidDividedByZeroException(); 
        }
        return i/j;
    }

}
