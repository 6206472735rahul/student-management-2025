package com.JpaHibernate.student_management.controller;

import com.JpaHibernate.student_management.model.Student;
import com.JpaHibernate.student_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

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

    // create a api for findStudentById using get method
    @GetMapping("/find/{id}")
    public Student findStudentById(@PathVariable int id){
     Student response= studentService.findStudentById(id);
     return response;

    }

    // create a api for find all student using get method
    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        List<Student>studentList= studentService.findAllStudent();
       return studentList;
    }
    // create a CountAllStudent api using get method
    @GetMapping("/count")
    public long CountAllStudent(){
      long response= studentService.CountAllStudent();
      return response;

    }
// write api for deleteById data present in db using
    //DeleteMapping
    @DeleteMapping("/delete/{id}")
    public String DeleteAllStudent(@PathVariable int id){
       String response= studentService.deleteAllStudent(id);
        return response;

    }

    // write api for update data with the help of id
    // using putMapping
    @PutMapping("/update/{id}")
    public String UpdateStudentById(@PathVariable int id,@RequestBody Student newStudentRequest){
      String response= studentService.updateStudentById(id,newStudentRequest);
      return response;

    }

    // write api for update specific field using patch method
    // if you pass specific field like parameter then use @RequestParam
    @PatchMapping("/updatePatch/{id}")
    public String UpdateStudentByPatch(@PathVariable int id,@RequestParam int age){
     String response = studentService.updateStudentByPatch(id,age);
     return response;

    }
}
