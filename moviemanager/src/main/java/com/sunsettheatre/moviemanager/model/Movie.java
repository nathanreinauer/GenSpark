package com.sunsettheatre.moviemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String rating;
    private String studio;
    private String releaseDate;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String movieCode;

    public Movie() {}

    public Movie(Long id, String name, String rating, String studio, String releaseDate, String imageUrl, String movieCode) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.studio = studio;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
        this.movieCode = movieCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getrating() {
        return rating;
    }

    public void setrating(String rating) {
        this.rating = rating;
    }

    public String getstudio() {
        return studio;
    }

    public void setstudio(String studio) {
        this.studio = studio;
    }

    public String getreleaseDate() {
        return releaseDate;
    }

    public void setreleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMovieCode() {
        return movieCode;
    }

    public void setMovieCode(String movieCode) {
        this.movieCode = movieCode;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating='" + rating + '\'' +
                ", studio='" + studio + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", movieCode='" + movieCode + '\'' +
                '}';
    }
}
