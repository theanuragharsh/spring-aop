package com.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class Dao1 {

    public String retrieveSomething() {
        return "This is Dao1.";
    }
}
