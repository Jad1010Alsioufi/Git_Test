package com.example.MyFirstProject;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.SessionScope;

public class Person {
    @NotEmpty(message = "Shouldn't be empty") public String fName;
    @NotEmpty(message = "Shouldn't be empty") public String lName;
    @NotEmpty(message = "Shouldn't be empty") public String email;
    @Min(value = 18, message = "Shouldn't be empty") public Integer age;

    public Person() {
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getEmail() {
        return email;
    }

    public Integer getAge() { return age;  }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setEmail(String email) {this.email = email;  }

    public void setAge(Integer age) {this.age = age;  }
}
