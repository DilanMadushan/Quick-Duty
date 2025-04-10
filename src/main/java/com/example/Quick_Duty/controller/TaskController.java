package com.example.Quick_Duty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/task")
public class TaskController {
    @GetMapping("/health")
    public String health() {
        return "Task Service is healthy";
    }

}
