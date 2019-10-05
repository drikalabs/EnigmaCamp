package com.enigma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String toStudentView(){
        return "student/student.html";
    }
    @GetMapping("/student-form")
    public String toStudentForm(){
        return "student/student-form.html";
    }
}
