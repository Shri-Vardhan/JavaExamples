package com.shrivardhan.college.controller;

import com.shrivardhan.college.model.Student;
import com.shrivardhan.college.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    private final StudentService studentService;
    public Studentcontroller(StudentService studentService){
        this.studentService = studentService;
    }


    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }

}


