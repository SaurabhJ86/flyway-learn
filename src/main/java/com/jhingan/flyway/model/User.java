package com.jhingan.flyway.model;


import jakarta.persistence.*;
import lombok.Data;
import org.springframework.cglib.core.GeneratorStrategy;

@Entity
@Data
@Table(name = "REGISTRATION_USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;
}
