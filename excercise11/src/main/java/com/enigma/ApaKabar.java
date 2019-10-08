package com.enigma;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ApaKabar extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");
        Integer hasil = Integer.parseInt(num1) + Integer.parseInt(num2);
        req.setAttribute("hasil", String.valueOf(hasil));
        req.getRequestDispatcher("/hasil/hasilnya.jsp").forward(req, resp);
    }
}
