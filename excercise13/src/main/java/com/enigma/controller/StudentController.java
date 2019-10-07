package com.enigma.controller;

import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    Logger logger= Logger.getLogger(StudentController.class.getName());
    @RequestMapping("/")
    public String gotoIndex(){
        logger.log(Level.INFO,"lewat index");
        return "index";
    }

    @RequestMapping("/student")
    public String gotoStudent(){
        logger.log(Level.INFO,"lewat student");
        return "student";
    }

    @RequestMapping("/student-form")
    public  String gotoStudentForm(){
        logger.log(Level.INFO,"lewat student form");
        return "student-form";
    }
    @PostMapping("/student-action")
    public String doSubmit(@RequestParam String id, @RequestParam String name , ModelMap model){
        logger.log(Level.INFO,id);
        logger.log(Level.INFO,name);
        Student student = new Student();
        student.setIdStudent(Integer.parseInt(id));
        student.setName(name);
        studentService.save(student);
        model.addAttribute("send",studentService.getAll());
        return "student";
    }
}
