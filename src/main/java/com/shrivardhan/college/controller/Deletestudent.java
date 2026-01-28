package com.shrivardhan.college.controller;

import com.shrivardhan.college.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/deletestudents")
public class Deletestudent {

    private final StudentService studentService;

    public Deletestudent(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}

