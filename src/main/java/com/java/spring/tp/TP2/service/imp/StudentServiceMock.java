package com.java.spring.tp.TP2.service.imp;

import com.java.spring.tp.TP2.model.Student;
import com.java.spring.tp.TP2.service.StudentService;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceMock implements StudentService {
    private List<Student> students = new ArrayList<>();

    @Override
    public void createStudent(Student student) {
        students.add(student);
    }

    @Override
    public Student findStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
        }
    }
}
