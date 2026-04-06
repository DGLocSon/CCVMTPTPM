package com.example.demo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class user_forgot_password {

    @GetMapping("/forgot-password")
    public String showForgotPassword() {
        return "common/forgot_password";
    }

    @PostMapping("/forgot-password")
    @ResponseBody
    public String handleForgotPassword(@RequestParam String email, @RequestParam String new_password) {
        return "<html><body>" +
               "<h2>Mật khẩu của bạn đã được thay đổi!</h2>" +
               "<p>Email: " + email + "</p>" +
               "<p>Mật khẩu mới đã được ghi nhận.</p>" +
               "<a href='login'>Quay lại đăng nhập</a>" +
               "</body></html>";
    }
}