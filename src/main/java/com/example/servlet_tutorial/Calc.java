package com.example.servlet_tutorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Calc", value = "/calc")
public class Calc extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter();

        String x_ = request.getParameter("x");
        String y_ = request.getParameter("y");
        String operator = request.getParameter("operator");

        int x = 0;
        int y = 0;
        int result = 0;

        if (!(x_.isEmpty() || y_.isEmpty())) {
            x = Integer.parseInt(x_);
            y = Integer.parseInt(y_);
        }

        if (operator.equals("덧셈")) {
            result = x + y;
        }

        if (operator.equals("뺄셈")) {
            result = x - y;
        }


        out.println("결과값 : " + result + "<br />");
    }
}
