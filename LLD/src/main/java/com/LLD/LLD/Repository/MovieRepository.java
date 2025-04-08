package com.LLD.LLD.Repository;

import com.LLD.LLD.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
