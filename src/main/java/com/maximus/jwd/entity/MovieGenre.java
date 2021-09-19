package com.maximus.jwd.entity;

public enum MovieGenre {
    CARTOON("Cartoon"),
    ACTION("Action"),
    COMEDY("Comedy"),
    ADVENTURE("Adventure"),
    HORROR("Horror"),
    THRILLER("Thriller"),
    DRAMA("Drama"),
    FAMILY("Family");

    private String name;

    MovieGenre(String name) {
        this.name = name;
    }
}
