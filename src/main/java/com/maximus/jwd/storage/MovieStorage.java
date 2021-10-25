package com.maximus.jwd.storage;

import com.maximus.jwd.entity.Movie;
import com.maximus.jwd.entity.MovieGenre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MovieStorage {
    private static List<Movie> MOVIES = new ArrayList<>(Arrays.asList(
            new Movie(1L, "How to train your dragon", new MovieGenre[]{MovieGenre.CARTOON, MovieGenre.FAMILY}, 98, 2010),
            new Movie(2L, "Gladiator", new MovieGenre[]{MovieGenre.DRAMA, MovieGenre.ADVENTURE}, 155, 2000)
    ));

    private static Long ID = (long) MOVIES.size();

    public List<Movie> getAllMovies() {
        return MOVIES;
    }

    public void addMovie(Movie movie) {
        long newId = ++ID;
        movie.setId(newId);
        MOVIES.add(movie);
    }

    public void changeMovie(Movie movie) {
       // List<Movie> changeMovies = MOVIES.stream().filter(e -> Objects.equals(e.getId(), movie.getId())).findFirst().;
        Movie editingMovie = MOVIES.stream().filter(e -> Objects.equals(e.getId(), movie.getId())).findFirst().get();

        if (editingMovie != null) {
            editingMovie.setTitle(movie.getTitle());
            editingMovie.setDuration(movie.getDuration());
            editingMovie.setReleaseYear(movie.getReleaseYear());
            editingMovie.setMovieGenres(movie.getMovieGenres());
        }
    }

}
