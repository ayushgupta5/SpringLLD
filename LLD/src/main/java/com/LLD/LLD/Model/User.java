package com.LLD.LLD.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer userID;

    private String name;
    private String email;
    private String phone;
    private String role; // GUEST, ADMIN, STAFF
    private String passwordHash;
}

