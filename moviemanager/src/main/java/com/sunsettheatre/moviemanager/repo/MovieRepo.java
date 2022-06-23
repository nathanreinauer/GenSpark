package com.sunsettheatre.moviemanager.repo;

import com.sunsettheatre.moviemanager.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MovieRepo extends JpaRepository<Movie, Long> {
    void deleteMovieById(Long id);

    Optional<Movie> findMovieById(Long id);
}
