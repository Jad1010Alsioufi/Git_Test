package com.example.MyFirstProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Hello {

//    @GetMapping("/hello/{value}")
//    public String sayHello(Model model, @PathVariable("value") String value) {
//        model.addAttribute("message", value);
//        return "/app/Hello.html";
//    }

    @GetMapping("/page")
    public String index(Model model, String a, String b){
        model.addAttribute("A", a);
        model.addAttribute("B", b);
        model.addAttribute("C");
        return "/app/Hello.html";
    }

//    @GetMapping("/form")
//    public String go(@RequestParam(value = "id", required = true, defaultValue = "Hi") String x) {
//        System.out.println(x);
//        return "/app/Form";
//    }

    @GetMapping("/form")
    public String go(Person person) {
        return "/app/Form";
    }

    @PostMapping("/form")
    public String goNow(Person person, Model model) {
//        System.out.println(person.getfName() + " " + person.getlName());
//        redirectAttributes.addFlashAttribute("fName", person.getfName());
//        return "redirect:/result";
//        model.addAttribute("fName", person.getfName());
        return "/app/Hello";
    }

    @GetMapping("/result")
    public String calc(Person person) {
        return "/app/Hello";
    }

//    @GetMapping("/{value1}/form/{value2}")
//    public String go(@PathVariable("value1") String x,
//                        @PathVariable("value2") String y) {
//        System.out.println(x);
//        System.out.println(y);
//        return "/app/Form";
//    }

//    @GetMapping("/form")
//    public ResponseEntity<String> go(Person person) {
//        return new ResponseEntity<>("/app/Form", HttpStatus.BAD_REQUEST);
//    }

//    @PostMapping("/form")
//    public String goNow(@Valid Person person, BindingResult result) {
//        if(result.hasErrors()){
//            return "/app/Form";
//        }
//        return "redirect:/hello";
//    }

    @GetMapping("/hello")
    public String ok(){
        return "/app/T";
    }

    @GetMapping("/gogo")
    public String log(OAuth2AuthenticationToken auth) {
        System.out.println(auth.getName());
        return "/app/B";
    }






    @GetMapping("/BMI")
    public String show(Man man) {
        return "/app/BMI.html";
    }

    @PostMapping("/BMI")
    public String calculate(Man man, Model model) {
        String result = "";
        double count = man.getWeight() / Math.sqrt(man.getHeight());
        if (count < 18.5) {
            result = "Underweight";
        }
        else if (count >= 18.5 && count < 24.9) {
            result = "Normal";
        }
        else {
            result = "Overweight";
        }
        model.addAttribute("result", result);
        System.out.println(result);
        return "/app/BMI.html";
    }










//    @GetMapping("/test")
//    public String func1() {
//        return "/app/Test1";
//    }
//
//    @PostMapping("/myPage1")
//    public String func2(String fName, String lName, Integer age, Model model) {
//        model.addAttribute("fName", fName);
//        model.addAttribute("lName", lName);
//        model.addAttribute("age", age);
//        return "/app/Test2";
//    }
//
//    @PostMapping("/myPage2")
//    public String func3(String fName, String lName, Integer age, String email, Integer password, Model model) {
//        model.addAttribute("fName", fName);
//        model.addAttribute("lName", lName);
//        model.addAttribute("age", age);
//        model.addAttribute("email", email);
//        model.addAttribute("password", password);
//        return "/app/Test3";
//    }

    @GetMapping("/test")
    public String func1(Person person) {
        return "/app/Test1";
    }

    @PostMapping("/myPage1")
    public String func2(Person person) {
        return "/app/Test2";
    }

    @PostMapping("/myPage2")
    public String func3(Person person, Integer password, Model model) {
        model.addAttribute("password", password);
        return "/app/Test3";
    }














}
