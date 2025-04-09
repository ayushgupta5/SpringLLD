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
public class Train {
    @Id
    @GeneratedValue
    private Integer trainID;
    private String trainName;
    private String trainType;
    private String departureTime;
    private String arrivalTime;
}
