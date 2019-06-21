package com.pgx.java.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.pgx.java.bean.Person;
@Controller
public class MyController {
    @GetMapping("/Hello")
    public String helloView(Model model) {
        
        Person p = new Person();
        p.setTitle("Dr.");
        p.setFirstName("John");
        p.setLastName("Watson");
        
        model.addAttribute("person", p);
    
        return "HelloWorld";
    }
}