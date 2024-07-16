package com.nemos.AASS.AASS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private int user_id;
    private String username;
    private String email;
    private String password;
}
