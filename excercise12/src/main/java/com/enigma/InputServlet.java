package com.enigma;

import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

public class InputServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idkey= req.getParameter("idkey");
        String name= req.getParameter("name");
        String birthPlace= req.getParameter("birthPlace");
        String date= req.getParameter("date");
        String gender= req.getParameter("gender");
        String major= req.getParameter("major");

        Student student = new Student(Integer.parseInt(idkey),name,birthPlace, Date.valueOf(date),gender,major);
        StudentDao.create(student);
        resp.sendRedirect("data");

    }
}
