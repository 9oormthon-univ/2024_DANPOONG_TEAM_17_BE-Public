package com.example.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "images")
@Entity
@Data
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "food_id")
    private Food food;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String name;

    @Lob
    private byte[] data;

    private Image(User user, Food food, String name, byte[] data) {
        this.food = food;
        this.name = name;
        this.data = data;
    }
}
