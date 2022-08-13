package com.adelin.project.student_service.service;

import com.adelin.project.student_service.entity.Student;
import com.adelin.project.student_service.repository.Student_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_Service {
    @Autowired
    private Student_Repository repository;


    public Student create_Student(Student student) {
        return repository.save(student);
    }

    public List<Student> create_Students(List<Student> students) {
        return repository.saveAll(students);
    }

    public Student get_Student_By_ID(int id) {
        return repository.findById(id).orElse(null);
    }


    public List<Student> get_Students() {
        return repository.findAll();
    }

    public Student get_Student_By_Name(String name) {
        return repository.findByName(name);
    }

    public String  delete_Student(int id) {
        repository.deleteById(id);
        return ("Student "+ id +" deleted" );
    }

    public Student update_Student_Info(Student student) {
        Student buffer = repository.findById(student.getId()).orElse(null);
        buffer.setFirst_name(student.getFirst_name());
        buffer.setLast_name(student.getLast_name());
        buffer.setCNP(student.getCNP());
        buffer.setDate_of_birth(student.getDate_of_birth());
        return repository.save(buffer);
    }
}
