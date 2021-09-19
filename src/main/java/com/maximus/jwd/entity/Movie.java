package com.maximus.jwd.entity;

import java.util.Arrays;
import java.util.Objects;

public class Movie {
    private long id;
    private final String title;
    private MovieGenre[] movieGenres;
    private final int duration;
    private final int releaseYear;

    public Movie(String title, MovieGenre[] movieGenres, int duration, int releaseYear) {
        this.title = title;
        this.movieGenres = movieGenres;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public Movie(long id, String title, MovieGenre[] movieGenres, int duration, int releaseYear) {
        this.id = id;
        this.title = title;
        this.movieGenres = movieGenres;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public MovieGenre[] getMovieGenres() {
        return movieGenres;
    }

    public void setMovieGenres(MovieGenre[] movieGenres) {
        this.movieGenres = movieGenres;
    }

    public int getDuration() {
        return duration;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return duration == movie.duration && releaseYear == movie.releaseYear && title.equals(movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration, releaseYear);
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", title='" + title + '\'' +
                ", movieGenres=" + Arrays.toString(movieGenres) +
                ", duration=" + duration +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
