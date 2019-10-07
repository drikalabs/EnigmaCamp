package com.enigma.service;

import com.enigma.connection.DBConnection;
import com.enigma.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public static void create(Student student) {
        Connection connection = DBConnection.makeConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("Insert into student(name,birth_place,birth_date,gender,major) " +
                    "values(?,?,?,?,?)");
            //example USING PREPARE STATEMENT
            statement.setString(1,student.getName());
            statement.setString(2,student.getBirthPlace());
            statement.setDate(3, (Date) student.getBirthDate());
            statement.setString(4,student.getGender());
            statement.setString(5,student.getMajor());
            statement.execute();
            //example USING STATEMENT
            /*Statement statement = connection.createStatement();
            statement.execute("insert into student(name,birth_place,birth_date,gender,major)" +
                    "values('"+student.getName()+"','"+student.getBirthPlace()+"','"+student.getBirthDate()+
                    "','"+student.getGender()+"','"+student.getMajor()+"')");*/

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Student>getAll(){
        Connection connection = DBConnection.makeConnection();
        List<Student> studentList =new ArrayList<>();
        try {
            Statement statement =connection.createStatement();
            ResultSet query=statement.executeQuery("select * from student");
            while (query.next()){
                Student student=new Student(query.getString("name"),query.getString("birth_place"),
                        Date.valueOf(query.getString("birth_date")),query.getString("gender"),
                        query.getString("major"));
                studentList.add(student);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }
    public static List<Student>search(String keyword){
        Connection connection = DBConnection.makeConnection();
        List<Student> studentList =new ArrayList<>();
        try {
            Statement statement =connection.createStatement();
            ResultSet query=statement.executeQuery("select * from student where name like '%"+keyword+"%'");
            while (query.next()){
                Student student=new Student(query.getString("name"),query.getString("birth_place"),
                        Date.valueOf(query.getString("birth_date")),query.getString("gender"),
                        query.getString("major"));
                studentList.add(student);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentList;
    }
}
