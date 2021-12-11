package com.maximus.jwd.dao.domain;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class User {
    private long id;      //unique
    private String name;
    private String email; //unique
    private char[] password;
    private int yearOfBirth;
    private Set<Long> setOfBoughtMovies;
    private HashMap<Long, Integer> filmsRating;

    public User(long id, String name, String email, char[] password, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
    }

    public User(long id, String name, String email, char[] password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, char[] password, int yearOfBirth) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
    }

    public User(String name, String email, char[] password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(long id, String name, String email, char[] password, int yearOfBirth, Set<Long> setOfBoughtMovies, HashMap<Long, Integer> filmsRating) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
        this.setOfBoughtMovies = setOfBoughtMovies;
        this.filmsRating = filmsRating;
    }

    public User(String name, String email, char[] password, int yearOfBirth, Set<Long> setOfBoughtMovies, HashMap<Long, Integer> filmsRating) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.yearOfBirth = yearOfBirth;
        this.setOfBoughtMovies = setOfBoughtMovies;
        this.filmsRating = filmsRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Set<Long> getSetOfBoughtMovies() {
        return setOfBoughtMovies;
    }

    public void setSetOfBoughtMovies(Set<Long> setOfBoughtMovies) {
        this.setOfBoughtMovies = setOfBoughtMovies;
    }

    public HashMap<Long, Integer> getFilmsRating() {
        return filmsRating;
    }

    public void setFilmsRating(HashMap<Long, Integer> filmsRating) {
        this.filmsRating = filmsRating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
