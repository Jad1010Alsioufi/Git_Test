package com.example.MyFirstProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HTML_STATE {

    @GetMapping("/start")
    public String startPage() {
        return "/app/Site1";
    }

    @PostMapping("/site1")
    public String postPage1(String fName, String lName, Model model) {
        model.addAttribute("fName", fName);
        model.addAttribute("lName", lName);
        System.out.println(fName);
        System.out.println(lName);
        return "/app/Site2";
    }

    @PostMapping("/site2")
    public String postPage2(String fName, String lName, String email, Integer password, Model model) {
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        model.addAttribute("fName", fName);
        model.addAttribute("lName", lName);
        return "/app/Site3";
    }

}
