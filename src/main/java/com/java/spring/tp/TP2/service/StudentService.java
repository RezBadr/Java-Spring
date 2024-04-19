package com.java.spring.tp.TP2.service;

import com.java.spring.tp.TP2.model.Student;

public interface StudentService {
    void createStudent(Student student);
    Student findStudentById(int id);
    void displayAllStudents();
}

