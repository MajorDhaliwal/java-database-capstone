package com.project.back_end.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Map;

@Controller
public class DashboardController {

    @Autowired
    private TokenValidationService tokenValidationService;

    @GetMapping("/adminDashboard/{token}")
    public String adminDashboard(@PathVariable String token) {
        Map<String, Object> result = tokenValidationService.validateToken(token, "admin");

        if (result.isEmpty()) {
            return "admin/adminDashboard";  // Thymeleaf template
        } else {
            return "redirect:http://localhost:8080";
        }
    }

    @GetMapping("/doctorDashboard/{token}")
    public String doctorDashboard(@PathVariable String token) {
        Map<String, Object> result = tokenValidationService.validateToken(token, "doctor");

        if (result.isEmpty()) {
            return "doctor/doctorDashboard";  // Thymeleaf template
        } else {
            return "redirect:http://localhost:8080";
        }
    }
}
