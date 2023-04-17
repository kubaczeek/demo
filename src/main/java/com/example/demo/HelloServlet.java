package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/HelloServlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        String[] prefs = request.getParameterValues("prefs");

        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Dane użytkownika</h2>");
        out.println("<p>Imię: " + firstName + "</p>");
        out.println("<p>Nazwisko: " + lastName + "</p>");
        out.println("<p>Wiek: " + age + "</p>");
        out.println("<p>Zainteresowania: ");
        if (prefs != null) {
            for (String pref : prefs) {
                out.println(pref + ", ");
            }
        }
        out.println("</p>");
        out.println("</body>");
        out.println("</html>");
    }
}
