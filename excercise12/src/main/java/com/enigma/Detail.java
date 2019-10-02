package com.enigma;

import com.enigma.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Detail extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id =req.getParameter("id");
    req.setAttribute("detail", StudentDao.getById(Integer.parseInt(id)));
    req.getRequestDispatcher("detail/detail.jsp").forward(req,resp);
    }
}
