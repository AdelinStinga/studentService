package com.adelin.project.student_service.repository;

import com.adelin.project.student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_Repository extends JpaRepository<Student, Integer> {
    Student findByName(String name);
}
