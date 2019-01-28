package com.example.demo;

import static java.lang.System.*;

public class Main {

    public static void main(String... args) {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        out.println(result);
    }
}
