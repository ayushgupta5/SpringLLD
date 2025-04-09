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
public class Bus {
    @Id
    @GeneratedValue
    private Integer busID;
    private String busName;
    private String busType;
    private String driverName;
    private String departureTime;
    private String arrivalTime;
}
