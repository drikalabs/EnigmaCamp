package com.enigma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
    @RequestMapping("/")
    public String gotoIndex(){
        return "index";
    }

    @RequestMapping("/student")
    public String gotoStudent(){
        return "student";
    }
}
