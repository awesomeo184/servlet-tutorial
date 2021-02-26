package com.example.servlet_filter;

import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter(urlPatterns = "/*", filterName = "characterEncodingFilter")
public class CharacterEncodingFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws ServletException, IOException {
        System.out.println("Before Chain");

        request.setCharacterEncoding("UTF-8");

        chain.doFilter(request, response);
        System.out.println("After Chain");
    }
}
