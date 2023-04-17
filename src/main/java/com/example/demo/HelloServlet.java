package com.example.demo;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ServletContext context = this.getServletContext();
        copyToContext(request, context, "fName");
        copyToContext(request, context, "lName");
        copyToContext(request, context, "age");
        String[] list = request.getParameterValues("interests");
        context.setAttribute("interests", list);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("printServlet");
        requestDispatcher.forward(request, response);
    }

    private static void copyToContext(HttpServletRequest request, ServletContext context, String parameter) {
        context.setAttribute(parameter, request.getParameter(parameter));
    }
}