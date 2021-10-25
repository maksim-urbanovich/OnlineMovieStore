package com.maximus.jwd.entity;

import java.util.Arrays;
import java.util.Objects;

public class Movie {
    private long id;
    private String title;
    private MovieGenre[] movieGenres;
    private int duration;
    private int releaseYear;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
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
