package com.example.demo.newentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.N*;

public class NewfileEntity {

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(messange="Invalid format")
    private String email;
}