package com.enigma;

import com.enigma.model.Direction;
import com.enigma.model.Robot;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RobotMovement extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String setup = req.getParameter("setup");
        String[] var = setup.split(",");
        String fuelss = req.getParameter("fuels");
        Robot robot = new Robot(Integer.parseInt(var[0]), Integer.parseInt(var[1]), Direction.valueOf(var[2].toUpperCase()));

        robot.addBatrei(Integer.parseInt(fuelss));
        String movement = req.getParameter("movement");
        robot.setCommands(movement);
        robot.Run();
        String output = robot.print();
        req.setAttribute("result", output);
        req.getRequestDispatcher("/hasil/result.jsp").forward(req, resp);
    }
}
