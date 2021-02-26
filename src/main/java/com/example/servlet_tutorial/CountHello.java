package com.example.servlet_tutorial;

import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CountHello", value = "/count-hello")
public class CountHello extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();

        String cnt = request.getParameter("cnt");
        int count = 0;

        if (cnt.isEmpty()) {
            count = 5;
        } else {
            count = Integer.parseInt(cnt);
        }

        for (int i = 0; i < count; i++) {
            out.println("안녕하세요.");
        }

    }
}
