package com.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class Dao2 {
    public Dao2() {
        System.out.println("This is Dao2.");
    }

    public String retrieveSomething() {
        return "This is Dao2.";
    }
}
