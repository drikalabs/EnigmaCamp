package com.enigma.controller;

import com.enigma.entity.Student;
import com.enigma.repositories.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentRepositories studentRepositories;

    @GetMapping("/student")
    public ModelAndView toStudentForm(Model model) {
        return new ModelAndView("student-form", "student", new Student());
    }

    @PostMapping
    public String studentAction(@ModelAttribute("student") Student student, Model model) {
        studentRepositories.save(student);
        List<Student> students = studentRepositories.findAll();

        model.addAttribute("studentlist", students);
        return "student-view";
    }

   /* @PostMapping("/student")
    public String studentAction(@RequestParam String idStudent,@RequestParam String name,@RequestParam String birthPlace,Model model){
        Student student = new Student();
        student.setIdStudent(Integer.parseInt(idStudent));
        student.setName(name);
        student.setBirthPlace(birthPlace);
        model.addAttribute("balasan",student);
        return "student-view";
    }*/
}

