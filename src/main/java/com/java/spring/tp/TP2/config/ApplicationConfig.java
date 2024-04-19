package com.java.spring.tp.TP2.config;

import com.java.spring.tp.TP2.repository.StudentRepository;
import com.java.spring.tp.TP2.service.StudentService;
import com.java.spring.tp.TP2.service.imp.InMemoryStudentRepository;
import com.java.spring.tp.TP2.service.imp.StudentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public StudentService studentService(StudentRepository studentRepository) {
        return new StudentServiceImpl(studentRepository);
    }

    @Bean
    public StudentRepository studentRepository() {
        return new InMemoryStudentRepository();
    }
}
