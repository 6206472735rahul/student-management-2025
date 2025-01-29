package com.JpaHibernate.student_management.repository;

import com.JpaHibernate.student_management.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {


}
