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
public class Movie {
    @Id
    @GeneratedValue
    private Integer movieID;
    private String title;
    private String director;
    private Integer releaseYear;
    private String genre;
    private Double rating;
    private Integer duration;
    private String language;
}
