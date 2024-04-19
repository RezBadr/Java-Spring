package com.java.spring.tp.TP2.service.imp;

import com.java.spring.tp.TP2.model.Student;
import com.java.spring.tp.TP2.repository.StudentRepository;
import com.java.spring.tp.TP2.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public void displayAllStudents() {
        List<Student> students = studentRepository.findAll();
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}

