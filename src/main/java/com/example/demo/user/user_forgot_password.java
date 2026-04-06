package com.example.demo.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/forgot-password")
public class user_forgot_password extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Forwarding to the template
        request.getRequestDispatcher("/templates/forgot_password.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String newPass = request.getParameter("new_password");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Mật khẩu của bạn đã được thay đổi!</h2>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Mật khẩu mới đã được ghi nhận.</p>");
        out.println("<a href='login.html'>Quay lại đăng nhập</a>");
        out.println("</body></html>");
    }
}