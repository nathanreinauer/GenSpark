package com.sunsettheatre.moviemanager.service;

import com.sunsettheatre.moviemanager.exception.MovieNotFoundException;
import com.sunsettheatre.moviemanager.model.Movie;
import com.sunsettheatre.moviemanager.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MovieService {
    private final MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public Movie addMovie(Movie movie){
        movie.setMovieCode(UUID.randomUUID().toString());
        return movieRepo.save(movie);
    }

    public List<Movie> findAllMovies(){
        return movieRepo.findAll();
    }

    public Movie updateMovie(Movie movie){
        return movieRepo.save(movie);
    }

    public Movie findMovieById(Long id){
        return movieRepo.findMovieById(id).orElseThrow(() -> new MovieNotFoundException("Movie with id " + id + " not found"));
    }

    public void deleteMovie(Long id){
        movieRepo.deleteMovieById(id);
    }
}
