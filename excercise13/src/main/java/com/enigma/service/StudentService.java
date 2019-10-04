package com.enigma.service;

import com.enigma.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    List<Student> students= new ArrayList<>();
    public void save(Student student){
        students.add(student);
    }
    public List<Student> getAll(){
        return this.students;
    }

}
