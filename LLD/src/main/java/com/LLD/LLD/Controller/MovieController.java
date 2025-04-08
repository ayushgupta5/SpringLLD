package com.LLD.LLD.Controller;

import com.LLD.LLD.Model.Movie;
import com.LLD.LLD.Service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private IMovieService movieService;

    @PostMapping("/save")
    public ResponseEntity<?> addMovie(@RequestBody Movie movie) {
        Movie newMovie = movieService.addMovie(movie);
        return new ResponseEntity<>(newMovie, HttpStatus.CREATED);
    }

    @GetMapping("/get/{movieID}")
    public ResponseEntity<?> getMovieByID(@PathVariable Integer movieID) {
        Movie movie = movieService.getMovie(movieID);
        return new ResponseEntity<>(movie, HttpStatus.FOUND);
    }

    @GetMapping("/get")
    public ResponseEntity<?> getMovies() {
        List<Movie> movies = movieService.getMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @PutMapping("/update/{movieID}")
    public ResponseEntity<?> updateMovie(@PathVariable Integer movieID, @RequestBody Movie updatedMovie) {
        Movie movie = movieService.updateMovie(movieID, updatedMovie);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{movieID}")
    public ResponseEntity<?> deleteMovie(@PathVariable Integer movieID) {
        movieService.deleteMovie(movieID);
        return new ResponseEntity<>("Movie Deleted Successfully", HttpStatus.OK);
    }
}
