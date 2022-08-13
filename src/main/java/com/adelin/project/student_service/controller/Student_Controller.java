package com.adelin.project.student_service.controller;

import com.adelin.project.student_service.entity.Student;
import com.adelin.project.student_service.service.Student_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Student_Controller {
    @Autowired
    private Student_Service service;

    @PostMapping("/add_student")
    public Student add_Student(@RequestBody Student student)
    {
        return service.create_Student(student);
    }
    @PostMapping("/add_students")
    public List<Student> add_Students(@RequestBody List<Student> students)
    {
        return service.create_Students(students);
    }

    @GetMapping("/getStudents/{id}")
    public Student get_Student_By_Id(@RequestBody int id)
    {
        return service.get_Student_By_ID(id);
    }
    @GetMapping("/getStudents/{name}")
    public Student get_Student_By_Name(@RequestBody String name)
    {
        return service.get_Student_By_Name(name);
    }
    @GetMapping("/getStudents")
    public List <Student> get_All_Students()
    {
        return service.get_Students();
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String delete_Student(@RequestBody int id)
    {
        return service.delete_Student(id);
    }

    @PutMapping("/updateStudent")
    public Student update_Student(@RequestBody Student student)
    {
        return service.update_Student_Info(student);
    }

}
