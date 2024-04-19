package com.java.spring.tp.TP2.repository;

import com.java.spring.tp.TP2.model.Student;

import java.util.List;

public interface StudentRepository {
    void save(Student student);
    Student findById(int id);
    List<Student> findAll();
}
