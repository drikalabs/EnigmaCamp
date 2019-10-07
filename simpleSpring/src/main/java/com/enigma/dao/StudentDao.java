package com.enigma.dao;

import com.enigma.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    List<Student> students= new ArrayList<>();
    public void  save(Student student){
        students.add(student);
    }
    public Student get(Integer id){
        Student found = null;
        for (Student stu:students) {
            if (stu.getIdSudent()==id){
                found=stu;
                break;
            }
        }
        return found;
    }
    public List<Student> getAll() {
        return students;
    }

}
