package com.example.servlet_tutorial;

import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "calc", value = "/calc")
public class Calc extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        resp.setContentType("text/html; charset=UTF-8");
        PrintWriter out = resp.getWriter();

        String firstOperand = req.getParameter("first-operand");
        String secondOperand = req.getParameter("second-operand");
        String operator = req.getParameter("operator");


        int i = Integer.parseInt(firstOperand);
        int j = Integer.parseInt(secondOperand);

        int result = 0;
        if (operator.equals("+")) {
            result = i + j;
        } else if (operator.equals("-")) {
            result = i - j;
        }


        out.println("result : " + result);
    }
}
