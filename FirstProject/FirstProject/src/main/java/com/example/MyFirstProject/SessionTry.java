package com.example.MyFirstProject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@SessionAttributes("person")
public class SessionTry {

    @ModelAttribute("person")
    public Person returnPerson() {
        return new Person();
    }

    // First Example ...

//    String name1;
//
//    @GetMapping("/session")
//    public String startPage() {
//        return "/app/SessionPage1";
//    }
//
//    @PostMapping("/session2")
//    public String sessionPage1(String fName, Model model) {
//        this.name1 = fName;
//        return "/app/SessionPage2";
//    }
//
//    @PostMapping("/session3")
//    public String sessionPage2(String email, Model model) {
//        System.out.println(this.name1 + " --> " + email);
//        return "/app/SessionPage2";
//    }



// -------------------------------------------------------------------

    // Second Example ...

//    @GetMapping("/session")
//    public String startPage(Model model) {
//        model.addAttribute("person", new Person());
//        return "/app/SessionPage1";
//    }
//
//    @PostMapping("/session2")
//    public String sessionPage1(Person person) {
//        return "/app/SessionPage2";
//    }
//
//    @PostMapping("/session3")
//    public String sessionPage2(Person person) {
//        System.out.println(person.getfName() + " --> " + person.getEmail());
//        return "/app/SessionPage2";
//    }


    @GetMapping("/session")
    public String startPage() {
        return "/app/SessionPage1";
    }

    @PostMapping("/session2")
    public String sessionPage1(Person person) {
        System.out.println(person.getfName() + " " + person.getlName());
        return "/app/SessionPage2";
    }

    @PostMapping("/session3")
    public String sessionPage2(Person person) {
        System.out.println(person.getfName() + " " + person.getlName());
        return "/app/SessionPage2";
    }

}
