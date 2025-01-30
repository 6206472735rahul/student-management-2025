package com.JpaHibernate.student_management.service;

import com.JpaHibernate.student_management.model.Student;
import com.JpaHibernate.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service // it's a service layer and contains business logic
public class StudentService {

    @Autowired // it helps to create obj for jpa child class
    // here we call child class like StudentRepository
    private StudentRepository studentRepository;

    // create a method for addStudent so that we can
    // use jpa inbuilt fun here
    public String addStudent(Student studentRequest) {
        studentRepository.save(studentRequest);
        return "Student saved successfully in db";
    }
    // find student details with help of findById()
    public Student findStudentById(int studentId){
        Optional<Student> studentOptional= studentRepository.findById(studentId);
        if(studentOptional.isPresent()){
         return studentOptional.get();
        }
       return null;
    }

    // find all student using get method
    public List<Student> findAllStudent(){
       List<Student> Studentlist= studentRepository.findAll();
       return Studentlist;

    }

    // count all student whatever present in db
    public long CountAllStudent(){
      long response=  studentRepository.count();
      return response;
    }
    //
}




