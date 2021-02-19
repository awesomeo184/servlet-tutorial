package com.example.servlet_tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate2")
public class Calculator2 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String[] operands = req.getParameterValues("value");

        int result = 0;

        for (int i = 0; i < operands.length; i++) {
            int operand = Integer.parseInt(operands[i]);
            result += operand;
        }


        out.println("result : " + result);
    }
}
