package com.example.MyFirstProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ErrorHandlerTry {

    @GetMapping("/open")
    public String startPage() {
        return "/app/Site1";
    }

    @PostMapping("/error")
    public String postPage1(Double age, String lName) {
        boolean a = age == 5;
        System.out.println(a);
        return "/app/Error";
    }

    @GetMapping("/injection")
    public String ModelAttributeInjection() {
        System.out.println("2");
        return "/app/ModelAttributeInjection";
    }

}
