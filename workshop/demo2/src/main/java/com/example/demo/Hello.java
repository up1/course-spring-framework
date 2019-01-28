package com.example.demo;

public class Hello {

    public String sayHi(String name) {
        NameFormatter formatter = new NameFormatter();
        return "Hi, " + formatter.format(name);
    }

}
