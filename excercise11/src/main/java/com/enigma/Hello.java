package com.enigma;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hello extends HttpServlet{
    private  static Logger logger =Logger.getLogger(Hello.class.getName());
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        logger.log(Level.INFO,"doGet dipanggil");
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
        logger.log(Level.INFO,"service dipanggil");
        super.service(req, res);
    }

    @Override
    public void init() throws ServletException {
        logger.log(Level.INFO,"Init dipanggil");
        super.init();
        System.out.println("init dipanggil");
    }
}
