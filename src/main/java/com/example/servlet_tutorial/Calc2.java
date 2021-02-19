package com.example.servlet_tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "calc2", value = "/calc2")
public class Calc2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String value = req.getParameter("value");
        String operator = req.getParameter("operator");


        int result = 0;

        if (!value.equals("")) {
            result = Integer.parseInt(value);
        }
        ServletContext application = req.getServletContext();

        if (operator.equals("=")) {
            int x = (Integer) application.getAttribute("value");
            int y = result;
            String operator_ = (String) application.getAttribute("operator");

            if (operator_.equals("+")) {
                result = x + y;
            } else {
                result = x - y;
            }

            out.println("result : " + result);

        } else {
            application.setAttribute("value", value);
            application.setAttribute("operator", operator);
        }

    }
}
