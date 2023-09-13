package com.example.what2watch.Models;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RatedFilmModel {
    private String title;
    private int releaseYear;
    private double rating;
    private String username;
    private String restOfInfo;


    public RatedFilmModel(String title, int releaseYear, double rating, String username, String restOfInfo) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.username = username;
        this.restOfInfo = restOfInfo;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}

    public int getReleaseYear() {return releaseYear;}
    public void setReleaseYear(int releaseYear) {this.releaseYear = releaseYear;}

    public double getRating() {return rating;}
    public void setRating(double rating) {this.rating = rating;}

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getRestOfInfo() {
        return restOfInfo;
    }
    public void setRestOfInfo(String restOfInfo) {
        this.restOfInfo = restOfInfo;
    }
}
