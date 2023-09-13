package com.example.what2watch.Models;

public class FilmModel {
    private String posterUrl;
    private String title;
    private int releaseDate;
    private String type;

    public FilmModel(String posterUrl, String title, int releaseDate, String type) {
        this.posterUrl = posterUrl;
        this.title = title;
        this.releaseDate = releaseDate;
        this.type = type;
    }

    public String getPoster() {
        return posterUrl;
    }
    public void setPoster(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }
    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
