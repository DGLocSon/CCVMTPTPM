package com.example.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/profile")
public class UserProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Forwarding to the template
        request.getRequestDispatcher("/templates/profile.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Handle saving profile information here
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        response.setContentType("text/html;charset=UTF-8");
        var out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Cập nhật thông tin thành công!</h2>");
        out.println("<p>Họ tên: " + name + "</p>");
        out.println("<a href='/profile'>Quay lại hồ sơ</a>");
        out.println("</body></html>");
    }
}
