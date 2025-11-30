package com.example.MyFirstProject;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseStatus;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@ControllerAdvice
public class ErrorHandler {

    // First Way ...

    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handler(NullPointerException exception) {
        System.out.println("Message ...................");
        System.out.println(exception.getMessage());
        System.out.println("End ...............");
        return "/app/False";
    }

    // Second Way ...

//    @ExceptionHandler(NullPointerException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public void handler(NullPointerException exception, HttpServletResponse response) throws IOException {
//        // 1. Set the status code explicitly
//        response.setStatus(HttpStatus.BAD_REQUEST.value()); // Sets the 404 header
//
//        // 2. Set the content type (optional, but good practice)
//        response.setContentType("application/json");
//
//        // 3. Manually write the JSON body (no return statement required)
//        String jsonBody = String.format(
//                "{\"message\":\"%s\", \"status\":%s}",
//                exception.getMessage(), "Hellooooooooooo"
//        );
//        response.getWriter().write(jsonBody);
//    }

    @ModelAttribute("myName")
    public String returnName() {
        return "Kaka";
    }

}
