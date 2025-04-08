package com.LLD.LLD.Service;

import com.LLD.LLD.Model.Movie;
import com.LLD.LLD.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Override
    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie updateMovie(Integer movieID, Movie movie) {
        Movie movieObject = movieRepository.findById(movieID).get();

        movieObject.setDirector(movie.getDirector());
        movieObject.setDuration(movie.getDuration());
        movieObject.setReleaseYear(movie.getReleaseYear());
        movieObject.setRating(movie.getRating());
        movieObject.setLanguage(movie.getLanguage());
        movieObject.setGenre(movie.getGenre());
        movieObject.setTitle(movie.getTitle());

//        movieObject.setDirector(movie.getDirector());
//        movieObject.setDuration(movie.getDuration());
//        movieObject.setReleaseYear(movie.getReleaseYear());
//        movieObject.setRating(movie.getRating());
//        movieObject.setLanguage(movie.getLanguage());
//        movieObject.setGenre(movie.getGenre());
//        movieObject.setTitle(movie.getTitle());

        //        movieObject.setDirector(movie.getDirector());
//        movieObject.setDuration(movie.getDuration());
//        movieObject.setReleaseYear(movie.getReleaseYear());
//        movieObject.setRating(movie.getRating());
//        movieObject.setLanguage(movie.getLanguage());
//        movieObject.setGenre(movie.getGenre());
//        movieObject.setTitle(movie.getTitle());

        return movieRepository.save(movieObject);

    }

    @Override
    public Movie getMovie(Integer movieID) {
        return movieRepository.findById(movieID).get();
    }

    @Override
    public List<Movie> getMovies() {
        return movieRepository.findAll();
    }

    @Override
    public void deleteMovie(Integer movieID) {
        movieRepository.deleteById(movieID);
    }
}
