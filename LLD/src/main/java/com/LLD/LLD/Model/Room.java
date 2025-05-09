package com.LLD.LLD.Model;

import jakarta.persistence.Column;
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
public class Room {
    @Id
    @GeneratedValue
    private Integer roomID;
    private String roomNumber;
    private String roomType; // SINGLE, DOUBLE, SUITE
    private double pricePerNight;
    @Column(name = "available", columnDefinition = "TINYINT(1)")
    private boolean available;
}

