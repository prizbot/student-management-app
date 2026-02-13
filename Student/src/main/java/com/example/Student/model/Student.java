package com.example.Student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// DAY 2: This class represents a DB table
@Entity
public class Student {

    // DAY 2: Primary key of table
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // DAY 2: Column in table
    private String name;

    private String email;

    private String password;

    // DAY 2: Empty constructor required by JPA
    public Student() {}

    // DAY 2: Constructor for creating object
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // DAY 2: Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) { 
        this.password = password; 
    }
}
