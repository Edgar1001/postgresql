package com.example.webapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;



@Entity
@Table(name = "app_user") // Change "app_user" to your desired table name
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use IDENTITY for PostgreSQL
    private Long id;

    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "password", length = 100)
    private String password;

    @Column(name = "email", length = 100)
    private String email;


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

