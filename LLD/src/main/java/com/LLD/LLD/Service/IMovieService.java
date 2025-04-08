package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Movie;

import java.util.List;

public interface IMovieService {
    Movie addMovie(Movie movie);
    Movie updateMovie(Integer movieID, Movie movie);
    Movie getMovie(Integer movieID);
    List<Movie> getMovies();
    void deleteMovie(Integer movieID);
}
