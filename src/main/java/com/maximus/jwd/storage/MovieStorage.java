package com.maximus.jwd.storage;

import com.maximus.jwd.entity.Movie;
import com.maximus.jwd.entity.MovieGenre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        long newID = ++ID;
        movie.setId(newID);
        MOVIES.add(movie);
    }


}
