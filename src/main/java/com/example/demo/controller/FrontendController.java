package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontendController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "common/index";
    }

    // Xử lý các link tĩnh có đuôi .html mà giao diện frontend hay dùng
    @RequestMapping(value = "/{folder}/{page}.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String handleHtmlFiles(@PathVariable String folder, @PathVariable String page) {
        return folder + "/" + page;
    }

    @RequestMapping(value = "/{page}.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String handleRootHtmlFiles(@PathVariable String page) {
        return "common/" + page; // Mặc định ở thư mục common nếu không ghi rõ
    }
    
    // Các đường dẫn riêng mà frontend đang gọi
    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {
        return "common/login";
    }

    @RequestMapping(value = "/profile", method = {RequestMethod.GET, RequestMethod.POST})
    public String profile() {
        return "user/profile";
    }

    @RequestMapping(value = "/forgot-password", method = {RequestMethod.GET, RequestMethod.POST})
    public String forgot() {
        return "common/forgot_password";
    }
}
