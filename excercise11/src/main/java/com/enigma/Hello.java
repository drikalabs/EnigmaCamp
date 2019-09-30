package com.enigma;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Hello extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String angka = req.getParameter("name");
        req.setAttribute("hasil",angka);
        req.getRequestDispatcher("/hasil/hasilnya.jsp").forward(req,resp);
        /*String name=req.getParameter("name");
        String output ="<html>"+
                "<body>"+
                "<h1>Aing Java Developer"+name+"<h1>"+
                "</body>"+
                "</html>";
        resp.setContentType("text/html");
        resp.getWriter().print(output);*/
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        super.service(req, res);
        System.out.println("service dipanggil");
    }

    @Override
    public void init() throws ServletException {
        super.init();
        System.out.println("init dipanggil");
    }
}
