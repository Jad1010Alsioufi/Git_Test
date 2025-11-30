package com.example.MyFirstProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Project {

    @GetMapping("/hello")
    public String ok(){
        return "/app/T";
    }

    @GetMapping("/login")
    public String startPage() {
        return "/app/Fake_Login";
    }

    @GetMapping("/welcome")
    public String log() {
        return "/app/B";
    }

    @GetMapping("/secret")
    public String goSecret() {
        return "/app/Secret";
    }

    @GetMapping("/bad")
    public String goBad() {
        return "/app/C";
    }

}
