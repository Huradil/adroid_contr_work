package com.project.myfirstprojectapp;

public class Movie {
    private String name;
    private String genre;
    private int year;
    private double rating;
    private String posterUrl;
    private String watchUrl;

    public Movie(String name, String genre, int year, double rating, String posterUrl, String watchUrl){
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
        this.posterUrl = posterUrl;
        this.watchUrl = watchUrl;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year){
        this.year=year;
    }

    public double getRating(){
        return this.rating;
    }

    public void setRating(double rating){
        this.rating=rating;
    }

    public String getPosterUrl(){
        return this.posterUrl;
    }

    public void setPosterUrl(String posterUrl){
        this.posterUrl=posterUrl;
    }

    public String getWatchUrl(){
        return this.watchUrl;
    }

    public void setWatchUrl(String watchUrl){
        this.watchUrl=watchUrl;
    }
}
