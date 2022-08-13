package com.adelin.project.student_service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Student_Table")
public class Student {

//    private String pattern = "zz-mm-yyy";
//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    @Id
    @GeneratedValue
    private int id;
    private String first_name;
    private  String last_name;
    private long CNP;
    private String date_of_birth;
}
