package com.example.servlet_tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class Calculator extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String firstOperand = req.getParameter("first-operand");
        String secondOperand = req.getParameter("second-operand");

        int i = Integer.parseInt(firstOperand);
        int j = Integer.parseInt(secondOperand);

        int result = i + j;

        out.println("result : " + result);
    }
}
