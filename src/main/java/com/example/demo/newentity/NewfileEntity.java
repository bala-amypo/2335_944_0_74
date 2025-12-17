package com.example.demo.newentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

public class NewfileEntity {

    @Id
    @GenerateValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message="no blank allowed")
    @Email(messange="Invalid format")
    private String email;
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Studententity(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    public Studententity() {
    }
    

    
    
    

}
}