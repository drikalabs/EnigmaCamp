package com.enigma;

import com.enigma.dao.StudentDao;
import com.enigma.model.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(StudentServlet.class.getName());

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Student> students = StudentDao.getAll();
        req.setAttribute("students", students);
        logger.log(Level.INFO, "doGet dipanggil");
        req.getRequestDispatcher("data.jsp").forward(req, resp);
    }
}
