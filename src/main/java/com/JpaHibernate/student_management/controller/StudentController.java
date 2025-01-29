package com.JpaHibernate.student_management.controller;

import com.JpaHibernate.student_management.model.Student;
import com.JpaHibernate.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/api")
public class StudentController {

    // create a obj for StudentService
    @Autowired
    private StudentService studentService;
    @PostMapping("/save") // create api for save
    public String saveStudent(@RequestBody Student studentRequest){
       String response=  studentService.addStudent(studentRequest);
       return response;
    }
}
