package com.springaop;

import com.springaop.business.Business1;
import com.springaop.business.Business2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Autowired
    private Business1 business1;
    @Autowired
    private Business2 business2;


    @Override
    public void run(String... args) throws Exception {
//         business1 = new Business1();
        business1.calculateSomething();
//        business2 = new Business2();
        business2.calculateSomething();
    }
}
