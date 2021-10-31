package com.maximus.jwd.dao.repository;

import com.maximus.jwd.entity.Movie;
import com.maximus.jwd.entity.MovieGenre;

import java.util.List;

public interface MovieDao {
    List<Movie> getAllMovies();
    Movie getMovieByName(String name);
    List<Movie> getMoviesByGenre(List<MovieGenre> genres);
    List<Movie> getMoviesByRating(int rating);
}
