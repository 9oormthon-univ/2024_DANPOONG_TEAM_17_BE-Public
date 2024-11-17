package com.example.springboot.entity;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "foods")
@NoArgsConstructor
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String explanation;

    private String ingredients;

    public Food(String name, String explanation, String ingredients) {
        this.name = name;
        this.explanation = explanation;
        this.ingredients = ingredients;
    }


}
