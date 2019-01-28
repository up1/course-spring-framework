package com.example.demo.exception;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.process();
    }

    private void process() {
        try {
            Calculator calculator = new Calculator();
            calculator.divide(2, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
