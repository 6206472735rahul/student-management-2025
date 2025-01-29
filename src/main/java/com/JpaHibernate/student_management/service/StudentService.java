package com.JpaHibernate.student_management.service;

import com.JpaHibernate.student_management.model.Student;
import com.JpaHibernate.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // it's a service layer and contains business logic
public class StudentService {

    @Autowired // it helps to create obj for jpa child class
    // here we call child class like StudentRepository
    private StudentRepository studentRepository;
    // create a method for addStudent so that we can
    // use jpa inbuilt fun here
    public String addStudent(Student studentRequest){
        studentRepository.save(studentRequest);
        return "Student saved successfully in db";
    }



}
