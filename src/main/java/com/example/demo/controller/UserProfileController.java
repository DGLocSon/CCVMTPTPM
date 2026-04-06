package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserProfileController {

    @GetMapping("/profile")
    public String showProfile() {
        return "user/profile";
    }

    @PostMapping("/profile")
    @ResponseBody
    public String updateProfile(@RequestParam String name, @RequestParam(required = false) String phone, @RequestParam(required = false) String address) {
        return "<html><body>" +
               "<h2>Cập nhật thông tin thành công!</h2>" +
               "<p>Họ tên: " + name + "</p>" +
               "<a href='/profile'>Quay lại hồ sơ</a>" +
               "</body></html>";
    }
}
