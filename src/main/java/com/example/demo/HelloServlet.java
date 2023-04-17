package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    private List<Integer> numberList = new ArrayList<>();

    public void init() {
        for (int i = 0; i < 5; i++) {
            numberList.add((int) (Math.random() * 100));
        }
        getServletContext().setAttribute("numberList", numberList);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        numberList = (List<Integer>) getServletContext().getAttribute("numberList");
        numberList.sort(Integer::compare);

        out.println("<html>");
        out.println("<body>");
        out.println("<a href=/demo_war_exploded/HelloServlet>link text</a>");
        out.println("<h2>Lista: </h2>" + numberList);
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}