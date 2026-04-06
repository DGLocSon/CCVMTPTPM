package com.example.demo;

class login {

    public String login() {
    // Simulate a login process
    String username = "admin";
    String password = "password";
    if (username == "admin" && password == "password") {
        return "Login successful!";
    } else {
        return "Invalid username or password.";
    }
}
}
