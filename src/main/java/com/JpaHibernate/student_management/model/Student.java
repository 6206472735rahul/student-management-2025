package com.JpaHibernate.student_management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // it is a field ya model class to represent db
@Table (name="student")  // it's create a table inside database table
public class Student {
@Id // it's denoted primary key of the table
@Column(nullable = false)// it's create a column inside database table
    private int studentId;
@Column(name = "name",nullable = false)
    private String name;
@Column(name = "age",nullable = false)
    private int age;
@Column(name = "email",nullable = false)
    private String email;
@Column(name = "gender",nullable = false)
    private String gender;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
