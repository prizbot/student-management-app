package com.example.Student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Student.model.Student;
import com.example.Student.repository.StudentRepository;

// DAY 2: Service contains business logic
@Service
public class StudentService {
    private final StudentRepository repo;
    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    // DAY 2: Save student
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // DAY 2: Get all students
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Optional<Student> getStudentsByEmail(String email) {
    return repo.findByEmail(email);
}

}
