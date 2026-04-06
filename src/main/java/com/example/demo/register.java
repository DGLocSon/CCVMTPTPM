package com.example.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class register extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String user = request.getParameter("username");
        String pass = request.getParameter("password");

        // In a real application, you would save this to a database
        // For now, we'll just show a success message
        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<p>Username: " + user + "</p>");
        out.println("<p>Password: " + pass + "</p>");
        out.println("<a href='login.html'>Login here</a>");
        out.println("</body></html>");
    }
}
