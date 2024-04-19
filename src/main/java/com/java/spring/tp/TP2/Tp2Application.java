package com.java.spring.tp.TP2;

import com.java.spring.tp.TP2.config.ApplicationConfig;
import com.java.spring.tp.TP2.model.Student;
import com.java.spring.tp.TP2.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		StudentService studentService = context.getBean(StudentService.class);

		Student student1 = new Student(1, "badr");
		Student student2 = new Student(2, "amine");
		studentService.createStudent(student1);
		studentService.createStudent(student2);

		int searchId = 1;
		Student foundStudent = studentService.findStudentById(searchId);
		if (foundStudent != null) {
			System.out.println("Student found: ID = " + foundStudent.getId() + ", Name = " + foundStudent.getName());
		} else {
			System.out.println("Student with ID " + searchId + " not found.");
		}

		System.out.println("All students:");
		studentService.displayAllStudents();
	}

}
