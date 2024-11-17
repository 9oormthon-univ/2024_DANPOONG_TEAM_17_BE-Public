package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "users")
@Entity
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Long provideId;

    private String name;

    private Integer identifier;

    private LocalDateTime createdAt;

    private Boolean isAdmin;

    private Boolean isDeleted;
}


