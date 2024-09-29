package com.example.demo.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "USER_INFO")
@Data
public class User {

    @Id
    private String id;
    private String username;
    private String password;
    private String email;
}
